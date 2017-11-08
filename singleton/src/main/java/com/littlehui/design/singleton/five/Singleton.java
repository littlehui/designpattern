package com.littlehui.design.singleton.five;

/**
 * Created by littlehui on 2017/10/26.
 */
public class Singleton {
    private static class Holder {
        private static Singleton singleton = new Singleton();
    }

    private Singleton(){}

    public static Singleton getSingleton(){
        return Holder.singleton;
    }
}