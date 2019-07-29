package com.littlehui.design.responsebilitychain;

/**
 * @Description TODO
 * @ClassName WarnLogger
 * @Author littlehui
 * @Date 2019/7/29 15:16
 * @Version 1.0
 **/
public class WarnLogger extends AbstractLogger {

    public WarnLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
