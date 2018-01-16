package com.littlehui.design.decorator;

/**
 * Created by littlehui on 2017/11/9.
 */
public class Client {

    public static void main(String[] args) {
        Money wages = new Wages();
        //奖金装饰它
        wages = new Bonuses(wages);
        //额外奖励装饰它
        wages = new Reward(wages);
        System.out.println("工资：" + wages.getDescription() + wages.totalMoney());
    }
}
