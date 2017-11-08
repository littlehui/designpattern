package com.littlehui.design.abfactory.product;

/**
 * Created by littlehui on 2017/11/8.
 */
public class SoftProductB extends ProductB {

    public SoftProductB() {
        System.out.println("创建 产品B:特性:柔软");
    }

    public String getName() {
        return super.getName() + "柔软";
    }
}
