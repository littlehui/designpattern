package com.littlehui.design.abfactory.factory;

import com.littlehui.design.abfactory.product.HardProductB;
import com.littlehui.design.abfactory.product.Product;
import com.littlehui.design.abfactory.product.SoftProductB;

/**
 * Created by littlehui on 2017/11/8.
 */
public class ProductFactoryB implements Factory {


    public Product createSoftProduct() {
        System.out.println("工厂B:");
        return new SoftProductB();
    }

    public Product createHardProduct() {
        System.out.println("工厂B:");
        return new HardProductB();
    }
}
