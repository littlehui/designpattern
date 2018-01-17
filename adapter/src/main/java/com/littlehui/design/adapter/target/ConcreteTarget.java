package com.littlehui.design.adapter.target;

/**
 * Created by littlehui on 2017/11/9.
 */
public class ConcreteTarget implements Target {

    public void doTargetThings(String value) {
        System.out.println("value is:" + value);
    }
}
