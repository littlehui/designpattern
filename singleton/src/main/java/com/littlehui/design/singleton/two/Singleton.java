package com.littlehui.design.singleton.two;

/**
 * Created by littlehui on 2017/10/26.
 */
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
