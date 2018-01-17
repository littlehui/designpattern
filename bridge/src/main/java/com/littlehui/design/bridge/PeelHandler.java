package com.littlehui.design.bridge;

/**
 * Created by littlehui on 2018/1/17.
 */
public class PeelHandler extends EatHandler {
    @Override
    public void handle() {
        super.handle();
        System.out.println("削皮");
    }
}
