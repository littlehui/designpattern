package com.littlehui.design.singleton.four;

/**
 * Created by littlehui on 2017/10/26.
 */
public class Singleton {
    private volatile static Singleton instance = null;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}