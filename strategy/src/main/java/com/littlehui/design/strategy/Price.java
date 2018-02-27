package com.littlehui.design.strategy;

/**
 * Created by littlehui on 2018/2/27.
 */
public class Price {

    private Double price;

    public Price(Double price) {
        this.price = price;
    }

    public Double cacularPrice(PriceStrategy priceStrategy) {
        return priceStrategy.caculaPrice(price);
    }
}
