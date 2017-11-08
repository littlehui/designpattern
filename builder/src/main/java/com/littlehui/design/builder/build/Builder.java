package com.littlehui.design.builder.build;

import com.littlehui.design.builder.product.Product;

/**
 * Created by littlehui on 2017/11/8.
 */
public interface Builder {

    public void buildProductPartA();

    public void buildProductPartB();

    public void buildProductPartC();

    public Product buildProduct();
}
