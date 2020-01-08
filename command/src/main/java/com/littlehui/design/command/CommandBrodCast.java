package com.littlehui.design.command;

/**
 * @Description TODO
 * @ClassName CommandInvoder
 * @Author littlehui
 * @Date 2020/1/8 16:34
 * @Version 1.0
 **/
public class CommandBrodCast {

    private Command huntingFishCommand;

    private Command cookingFishCommand;

    public void setCookingFishCommand(Command cookingFishCommand) {
        this.cookingFishCommand = cookingFishCommand;
    }

    public void setHuntingFishCommand(Command huntingFishCommand) {
        this.huntingFishCommand = huntingFishCommand;
    }


    public void cookingFish() {
        cookingFishCommand.execute();
    }

    public void huntingFish() {
        huntingFishCommand.execute();
    }
}
