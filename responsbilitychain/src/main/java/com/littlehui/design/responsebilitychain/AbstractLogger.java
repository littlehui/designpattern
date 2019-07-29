package com.littlehui.design.responsebilitychain;

/**
 * @Description TODO
 * @ClassName AbstractLogger
 * @Author littlehui
 * @Date 2019/7/29 15:12
 * @Version 1.0
 **/
public abstract class AbstractLogger {

    public static int INFO = 1;

    public static int WARN = 2;

    public static int ERROR = 3;

    protected int level;

    AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
