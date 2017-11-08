package com.littlehui.design.abfactory.product;

/**
 * Created by littlehui on 2017/11/8.
 */
public class SoftProductA extends ProductA {

    public SoftProductA() {
        System.out.println("创建 产品A:特性:柔软");
    }

    public String getName() {
        return super.getName() + "柔软";
    }
}
