package com.littlehui.design.bridge;

/**
 * Created by littlehui on 2018/1/17.
 */
public class EatHandlerDivid extends EatHandler {
    public void handle() {
        super.handle();
        System.out.println("切块。");
    }
}
