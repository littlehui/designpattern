package com.littlehui.design.responsebilitychain;

/**
 * @Description TODO
 * @ClassName Demo
 * @Author littlehui
 * @Date 2019/7/29 15:18
 * @Version 1.0
 **/
public class Demo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger warnLogger = new WarnLogger(AbstractLogger.WARN);

        errorLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(warnLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.WARN,
                "This is a warn level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
