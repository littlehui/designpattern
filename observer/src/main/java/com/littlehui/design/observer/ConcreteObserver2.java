package com.littlehui.design.observer;

/**
 * @Description TODO
 * @ClassName ConcreteObserver2
 * @Author littlehui
 * @Date 2019/10/9 16:41
 * @Version 1.0
 **/
public class ConcreteObserver2 implements Observer {

    @Override
    public void update(String message) {
        System.out.println("观察者2：" + message);
    }
}
