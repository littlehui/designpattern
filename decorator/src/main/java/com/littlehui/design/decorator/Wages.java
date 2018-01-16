package com.littlehui.design.decorator;

/**
 * Created by littlehui on 2018/1/15.
 */
public class Wages implements Money {

    public Double totalMoney() {
        return 10D;
    }

    public String getDescription() {
        return "基础工资，";
    }
}
