package com.littlehui.design.abfactory.product;

/**
 * Created by littlehui on 2017/11/8.
 */
public class HardProductA extends ProductA {

    public HardProductA() {
        System.out.println("创建 产品A:特性:坚硬");
    }

    public String getName() {
        return super.getName() + "坚硬";
    }
}
