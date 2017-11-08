---
title: 设计模式系列：工厂方法模式 
date: 2017/10/25 11:54:44  
categories:  
tags:
---

### 概念
> 工厂与一类产品的关系。用于调用端从复杂的构造逻辑中解耦。

### 实现
简单工厂模式
产品：
Product
```java
    public interface Product {
        public void methodOne();
        public void methodTwo();
    }
```
ProductA
```java
    public class ProductA implements Product {
        public void methodOne() {
            System.out.print("A产品方法1");
        }
        public void methodTwo() {
            System.out.print("A产品方法2");
        }
    }
```
ProductB
```java
    public class ProductB implements Product {
        public void methodOne() {
            System.out.print("B产品方法1");
        }
        public void methodTwo() {
            System.out.print("B产品方法2");
        } 
    }
```
工厂：
Factory
```java
    public interface Factory {
        public Product createProduct(String type);
    }
```
SimpleFactory
```java
    public class SimpleFactory implements Factory {
        public Product createProduct(String type) {
            switch (type) {
                case "A": 
                    return new ProductA();
                break;
                case "B": 
                    return new ProductB();
                break;
                default: 
                    return null;
            }
        }
    }
```
    PS：这里用Java7的写法，switch支持String。
    
客户端：
Client
```java
public class Client {
    public static void main(String[] args) {
        Factory factory = new SimpleFactory();
        Product product = factory.createProduct("A");
        product.methodOne();
        product.methodTwo();
        //业务代码 
    }
}
```
### 场景
A是一个接口，它的实现由 ClassA1,ClassA2,ClassA3。
B是一段业务代码，需要new一个A1并且进行操作。这时候就可以用工厂模式。某天业务的修改，需操作到另外一个ClassA2的方法。在工厂类进行修改就可以了。业务端代码就不用修改。

### 总结
>工厂方法模式有良好的封装性，代码结构清晰。扩展性非常优秀。在增加产品类的情况下，只要适当地修改具体或扩展工厂类即可。调用者它只需要关心产品的接口。 可以对调用端调用复杂的构造逻辑进行解耦。