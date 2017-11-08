package com.littlehui.design.prototype.deepclone;


import java.io.*;

/**
 * Created by littlehui on 2017/11/8.
 */
public class Product implements Serializable {

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

    public Product deepClone(){
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);
            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return (Product)oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }

}
