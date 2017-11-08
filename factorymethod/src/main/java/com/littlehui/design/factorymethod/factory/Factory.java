package com.littlehui.design.factorymethod.factory;

import com.littlehui.design.factorymethod.product.Product;

/**
 * Created by littlehui on 2017/11/8.
 */
public interface Factory {
    public Product createProduct(String type);
}
