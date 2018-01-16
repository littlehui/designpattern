package com.littlehui.design.proxy.dymatic;


/**
 * Created by littlehui on 2018/1/16.
 */
public class Client {

    public static void main(String[] args) {
        Car bus = new Bus();
        Car newBus = (Car) new BusProxyFactory(bus).getNewInstance();
        System.out.println(newBus.getClass());
        newBus.run();
        System.out.println("-----------cglib------------");
        Car cglibBus = (Car)new BusProxyFactoryCglib().getInstanceByClass(Bus.class);
        cglibBus.run();
        System.out.println(cglibBus.getClass());
    }
}
