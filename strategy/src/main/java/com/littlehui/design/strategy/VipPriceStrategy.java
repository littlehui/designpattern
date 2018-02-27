package com.littlehui.design.strategy;

/**
 * Created by littlehui on 2018/2/27.
 */
public class VipPriceStrategy implements PriceStrategy {

    public Double caculaPrice(Double price) {
        return price * 0.8;
    }
}
