package com.littlehui.design.bridge;

/**
 * Created by littlehui on 2018/1/17.
 */
public class Apple extends AbstractFruit {

    public Apple(EatHandler eatHandler) {
        super(eatHandler);
    }

    public void enjoy() {
        eat();
    }
}
