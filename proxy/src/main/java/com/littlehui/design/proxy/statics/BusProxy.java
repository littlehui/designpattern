package com.littlehui.design.proxy.statics;

/**
 * Created by littlehui on 2018/1/16.
 */
public class BusProxy implements Car {

    public void run() {
        System.out.println("car proxy");
        Car bus = new Bus();
        bus.run();
    }
}
