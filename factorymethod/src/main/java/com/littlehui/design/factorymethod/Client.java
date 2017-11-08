package com.littlehui.design.factorymethod;

import com.littlehui.design.factorymethod.factory.Factory;
import com.littlehui.design.factorymethod.factory.SimpleFactory;
import com.littlehui.design.factorymethod.product.Product;

/**
 * Created by littlehui on 2017/11/8.
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new SimpleFactory();
        Product product = factory.createProduct("A");
        product.methodOne();
        product.methodTwo();
        //业务代码
    }
}
