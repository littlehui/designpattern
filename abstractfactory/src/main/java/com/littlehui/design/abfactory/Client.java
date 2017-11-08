package com.littlehui.design.abfactory;

import com.littlehui.design.abfactory.factory.Factory;
import com.littlehui.design.abfactory.factory.ProductFactoryA;
import com.littlehui.design.abfactory.factory.ProductFactoryB;
import com.littlehui.design.abfactory.product.Product;

/**
 * Created by littlehui on 2017/11/8.
 */
public class Client {

    public static void main(String[] args) {
        Factory factoryA = new ProductFactoryA();
        Factory factoryB = new ProductFactoryB();
        Product productAHard = factoryA.createHardProduct();
        System.out.println(productAHard.getName());
        Product productBHard = factoryB.createHardProduct();
        System.out.println(productBHard.getName());
        Product productASoft = factoryA.createSoftProduct();
        System.out.println(productASoft.getName());
        Product productBSoft = factoryB.createSoftProduct();
        System.out.println(productBSoft.getName());
    }

}
