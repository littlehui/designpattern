package com.littlehui.design.command;

/**
 * @Description 鱼长官
 * @ClassName Client
 * @Author littlehui
 * @Date 2020/1/8 16:29
 * @Version 1.0
 **/
public class FishCommander {

    public static void main(String[] args) {
        FishSoldier fishSoldier = new FishSoldier();
        Command huntingFishCommand = new HuntingFishCommand(fishSoldier);
        Command cookingFishCommand = new CookingFishCommand(fishSoldier);
        CommandBrodCast commandBrodCast = new CommandBrodCast();
        commandBrodCast.setCookingFishCommand(cookingFishCommand);
        commandBrodCast.setHuntingFishCommand(huntingFishCommand);
        commandBrodCast.huntingFish();
        commandBrodCast.cookingFish();
    }
}
