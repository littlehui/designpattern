package com.littlehui.design.builder.build;

import com.littlehui.design.builder.product.Product;

/**
 * Created by littlehui on 2017/11/8.
 */
public class Director {

    public Product constructProduct(Builder productBuilder){
        productBuilder.buildProductPartA();
        productBuilder.buildProductPartB();
        productBuilder.buildProductPartC();
        return productBuilder.buildProduct();
    }
}
