package com.littlehui.design.responsebilitychain;

/**
 * @Description TODO
 * @ClassName InfoLogger
 * @Author littlehui
 * @Date 2019/7/29 15:16
 * @Version 1.0
 **/
public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
