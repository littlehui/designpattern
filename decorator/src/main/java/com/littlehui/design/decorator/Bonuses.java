package com.littlehui.design.decorator;

/**
 * Created by littlehui on 2018/1/15.
 */
public class Bonuses implements Money {

    Money money;

    public Bonuses(Money money) {
        this.money = money;
    }

    public Double totalMoney() {
        return 5d + money.totalMoney();
    }

    public String getDescription() {
        return "加上奖金" + money.getDescription();
    }
}
