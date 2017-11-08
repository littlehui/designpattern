package com.littlehui.design.prototype.lightclone;

/**
 * Created by littlehui on 2017/11/8.
 */
public class Product implements Cloneable {

    private String name;

    private String value;

    private ProductB productB;

    public ProductB getProductB() {
        return productB;
    }

    public void setProductB(ProductB productB) {
        this.productB = productB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void display() {
        System.out.println("product name:" + this.name);
        System.out.println("product value:" + this.value);
        System.out.println("productB name:" + this.productB.getName());
    }

    public Product clone() {
        try {
            return (Product)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
