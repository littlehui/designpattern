package com.littlehui.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @ClassName ConcreteSubject
 * @Author littlehui
 * @Date 2019/10/9 16:38
 * @Version 1.0
 **/
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
