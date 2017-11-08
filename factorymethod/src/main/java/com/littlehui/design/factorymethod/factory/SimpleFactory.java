package com.littlehui.design.factorymethod.factory;

import com.littlehui.design.factorymethod.product.Product;
import com.littlehui.design.factorymethod.product.ProductA;
import com.littlehui.design.factorymethod.product.ProductB;

/**
 * Created by littlehui on 2017/11/8.
 */
public class SimpleFactory implements Factory {
    public Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
