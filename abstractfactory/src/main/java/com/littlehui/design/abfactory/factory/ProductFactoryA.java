package com.littlehui.design.abfactory.factory;

import com.littlehui.design.abfactory.product.HardProductA;
import com.littlehui.design.abfactory.product.Product;
import com.littlehui.design.abfactory.product.SoftProductA;


/**
 * Created by littlehui on 2017/11/8.
 */
public class ProductFactoryA implements Factory {

    public Product createSoftProduct() {
        System.out.println("工厂A:");
        return new SoftProductA();
    }

    public Product createHardProduct() {
        System.out.println("工厂A:");
        return new HardProductA();
    }
}
