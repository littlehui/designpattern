package com.littlehui.design.observer;

/**
 * @Description TODO
 * @ClassName Client
 * @Author littlehui
 * @Date 2019/10/9 16:42
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver2();

        Subject subject = new ConcreteSubject();
        subject.register(observer1);
        subject.register(observer2);

        subject.notify("呼叫司令。");

    }
}
