package com.littlehui.design.responsebilitychain;

/**
 * @Description TODO
 * @ClassName ErrorLogger
 * @Author littlehui
 * @Date 2019/7/29 15:15
 * @Version 1.0
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
