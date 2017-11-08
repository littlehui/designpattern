package com.littlehui.design.abfactory.product;

/**
 * Created by littlehui on 2017/11/8.
 */
public class HardProductB extends ProductB {

    public HardProductB() {
        System.out.println("创建 产品B:特性:坚硬");
    }
    public String getName() {
        return super.getName() + "坚硬";
    }
}
