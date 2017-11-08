package com.littlehui.design.prototype.lightclone;



/**
 * Created by littlehui on 2017/11/8.
 */
public class Client {

    public static void main(String[] args) {
        Product product = new Product();
        ProductB productB = new ProductB();
        productB.setName("B");
        product.setName("X");
        product.setValue("XX");
        product.setProductB(productB);
        Product clone = product.clone();
        clone.getProductB().setName("newXX");
        product.display();
        clone.display();
    }

}
