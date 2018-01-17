package com.littlehui.design.facade;

/**
 * Created by littlehui on 2018/1/16.
 */
public class Client {
    public static void main(String[] args) {
        MyOneDay myOneDay = new MyOneDay(new Morning(), new Office(), new Back(), new Road(), new Rest());
        myOneDay.myWholeDay();
    }
}
