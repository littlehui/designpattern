package com.littlehui.design.proxy.statics;

/**
 * Created by littlehui on 2018/1/16.
 */
public class Client {

    public static void main(String[] args) {
        Car bus = new BusProxy();
        bus.run();
    }
}
