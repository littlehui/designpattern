package com.littlehui.design.builder;

import com.littlehui.design.builder.build.Director;
import com.littlehui.design.builder.build.ProductBuilder;

/**
 * Created by littlehui on 2017/11/8.
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        director.constructProduct(new ProductBuilder());
    }
}
