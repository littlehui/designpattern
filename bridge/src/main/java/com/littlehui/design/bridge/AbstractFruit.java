package com.littlehui.design.bridge;

/**
 * Created by littlehui on 2018/1/17.
 */
public class AbstractFruit implements Fruit {

    EatHandler eatHandler;

    public AbstractFruit(EatHandler eatHandler) {
        this.eatHandler = eatHandler;
    }

    public void eat() {
        eatHandler.handle();
        System.out.println("开始吃水果。");
    }
}
