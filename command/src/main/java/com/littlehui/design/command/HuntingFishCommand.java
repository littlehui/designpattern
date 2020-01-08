package com.littlehui.design.command;

/**
 * @Description TODO
 * @ClassName HuntingFish
 * @Author littlehui
 * @Date 2020/1/8 16:31
 * @Version 1.0
 **/
public class HuntingFishCommand implements Command {

    FishSoldier fishSoldier;

    public HuntingFishCommand(FishSoldier fishSoldier) {
        this.fishSoldier = fishSoldier;
    }

    public void execute() {
        fishSoldier.doHuntingFish();
    }
}
