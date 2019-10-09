package com.littlehui.design.observer;

/**
 * @Description TODO
 * @ClassName ConcreteObserver
 * @Author littlehui
 * @Date 2019/10/9 16:38
 * @Version 1.0
 **/
public class ConcreteObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("观察者1：" + message);
    }
}
