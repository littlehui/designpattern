package com.littlehui.design.composite;

/**
 * Created by littlehui on 2018/1/18.
 */
public class Chicken extends IteratorAnimal {


    public void run() {
        System.out.println("小鸡跑");
    }

    public void each() {
        System.out.println("鸡");
    }
}
