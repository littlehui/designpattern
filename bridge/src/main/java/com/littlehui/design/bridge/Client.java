package com.littlehui.design.bridge;

/**
 * Created by littlehui on 2018/1/17.
 */
public class Client {
    public static void main(String[] args) {
        EatHandler eatHandler = new PeelHandler();
        EatHandler eatHandler1 = new EatHandlerDivid();
        Fruit apple = new Apple(eatHandler);
        Fruit waterMelon = new WaterMelon(eatHandler1);
        apple.eat();
        waterMelon.eat();
    }
}
