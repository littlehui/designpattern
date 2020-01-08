package com.littlehui.design.command;

/**
 * @Description TODO
 * @ClassName CookingFishCommand
 * @Author littlehui
 * @Date 2020/1/8 16:32
 * @Version 1.0
 **/
public class CookingFishCommand implements Command {

    FishSoldier fishSoldier;

    public CookingFishCommand(FishSoldier fishSoldier) {
        this.fishSoldier = fishSoldier;
    }

    public void execute() {
        fishSoldier.doCookingFish();
    }
}
