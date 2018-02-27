package com.littlehui.design.strategy;

/**
 * Created by littlehui on 2018/2/27.
 */
public class Client {

    public static void main(String[] args) {
        Price price = new Price(5D);
        System.out.println(price.cacularPrice(new VipPriceStrategy()));
    }
}
