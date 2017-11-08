---
title: 设计模式系列：单例模式  
date: 2017/10/23 16:23:02  
categories: [Java,设计模式,单例]  
tags: [设计模式，单例]
---
### 概念
单例模式，顾名思义就是在Java应用中，类的实例保证只有一个在JVM中。他有几个好处
- 减少创建开销
- 减少内存使用频率，GC压力
- 保证流程独立

### 实现

#### 第一种 饿汉法
```java

public class Singleton {
    
    private static Singleton singleton = new Singleton();
    
    private Singleton() {
        
    }
    public static Singleton getSignleton(){
        return singleton;
    }
}

```
代码简单，但是无法延迟加载。

#### 第二种 单线程安全
```java
public class Singleton {  
    private static Singleton instance = null;  
    private Singleton() {  
    }  
    public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }  
}
```
这种方式可以实现基本要求，但是在多线程情况下就会出现可能New出多个实例的情况。由此引入synchronized关键字，我们有如下实现：
#### 第三种 多线程安全
```java
public class Singleton {  
    private static Singleton instance = null;  
    private Singleton() {  
    }  
    public static Singleton getInstance() {  
        if (instance == null) {  
            synchronized (Singleton.class) {  
                if (instance == null) {  
                    instance = new Singleton();  
                }  
            }  
        }  
        return instance;  
    }  
}
```
第二种方法引入了syncronized 关键字，在调用getInstance方法的时候进行了并发处理。然而在多线程情况下仍然有问题  
情况如下：  

    a>A、B线程同时进入了第一个if判断
    b>A首先进入synchronized块，由于instance为null，所以它执行instance = new Singleton();
    c>在new对象的过程中，由于JVM的优化，指令进行重排序，JVM先画出了一些分配给Singleton实例的空白内存，并赋值给instance成员（注意此时JVM没有开始初始化这个实例），然后A离开了synchronized块。
    d>B进入synchronized块，由于instance此时不是null，因此它马上离开了synchronized块并将结果返回给调用该方法的程序。
    e>此时B线程打算使用Singleton实例，却发现它没有被初始化，于是错误发生了。

这里引入volatile关键字禁止对instance操作的指令重排。
#### 第四种 多线程安全"多重锁检查""
```java
public class Singleton {  
    private volatile static Singleton instance = null;  
    private Singleton() {  
    }  
    public static Singleton getInstance() {  
        if (instance == null) {  
            synchronized (Singleton.class) {  
                if (instance == null) {  
                    instance = new Singleton();  
                }  
            }  
        }  
        return instance;  
    }  
}
```
这种方法就是有名的DCL的单利模式。基本已经完善多线程下的单例模式。需要提醒的是， volatile屏蔽指令重排的语义在JDK 1.5中才被修复，所以JDK1.5之前的JAVA无法使用这一方式。

#### 第五种 静态内部类方法
静态类方法：
```java
public class Singleton {
    private static class Holder {
        private static Singleton singleton = new Singleton();
    }
     
    private Singleton(){}
         
    public static Singleton getSingleton(){
        return Holder.singleton;
    }
}
```
类只加载一次，所以这中方式也是线程安全的。
不过以上的方法都存在一些问题：
- 进行序列化时需要额外的工作进行序列化(Serializable,transient,readResolve())等操作。否则每次序列化都是创建一个新的实例。
- 构造器虽然是私有的，但是还是可以通过反射来强行调用创建实例。一个方法是在构造器里判断已经创建过实例抛异常。
如何更优雅地解决以上两个缺陷呢，我们可以使用枚举单例。

#### 第六种 枚举方法
```java
public enum Singleton {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
```
枚举不仅线程安全，防止反射强行调用构造器外。还提供了自动化序列机制，繁殖序列化的时候创建新对象。
更接近与"完美"的单利模式。

### 场景
程序执行时候只需要一个实例执行的时候就可以用单例来：经典的场景有:  
线程池，驱动管理，通用的计算模块，工具类代码等等

### 总结
> 单例模式既熟悉，又陌生。看起来简单的功能，算法，要写好，无瑕疵，还是需要很大专研精神。避免遇到快很多坑。