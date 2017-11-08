package com.littlehui.design.abfactory.factory;

import com.littlehui.design.abfactory.product.Product;

/**
 * Created by littlehui on 2017/11/8.
 */
public interface Factory {

    public Product createSoftProduct();

    public Product createHardProduct();
}
