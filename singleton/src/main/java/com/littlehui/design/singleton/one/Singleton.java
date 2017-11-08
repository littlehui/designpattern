package com.littlehui.design.singleton.one;

/**
 * Created by littlehui on 2017/10/26.
 */

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }
    public static Singleton getSignleton(){
        return singleton;
    }
}

