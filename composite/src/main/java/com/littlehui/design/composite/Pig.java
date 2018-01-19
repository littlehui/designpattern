package com.littlehui.design.composite;

/**
 * Created by littlehui on 2018/1/18.
 */
public class Pig extends IteratorAnimal {

    public void run() {
        System.out.println("猪在跑");
    }

    public void each() {
        System.out.println("猪");
    }
}
