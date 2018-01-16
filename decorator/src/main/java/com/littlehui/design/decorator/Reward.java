package com.littlehui.design.decorator;

/**
 * Created by littlehui on 2018/1/15.
 */
public class Reward implements Money {

    Money money;

    public Reward(Money money) {
        this.money = money;
    }

    public Double totalMoney() {
        return 4d + money.totalMoney();
    }

    public String getDescription() {
        return "加上额外奖励" + money.getDescription();
    }
}
