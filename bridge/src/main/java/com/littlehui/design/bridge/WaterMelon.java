package com.littlehui.design.bridge;

/**
 * Created by littlehui on 2018/1/17.
 */
public class WaterMelon extends AbstractFruit {


    public WaterMelon(EatHandler eatHandler) {
        super(eatHandler);
    }

    public void eat() {
        super.eat();
        System.out.println("吃西瓜");
    }
}
