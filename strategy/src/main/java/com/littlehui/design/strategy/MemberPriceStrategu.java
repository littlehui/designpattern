package com.littlehui.design.strategy;

/**
 * Created by littlehui on 2018/2/27.
 */
public class MemberPriceStrategu implements PriceStrategy {
    public Double caculaPrice(Double price) {
        return price * 0.9;
    }
}
