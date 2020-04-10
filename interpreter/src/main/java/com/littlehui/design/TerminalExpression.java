package com.littlehui.design;

/**
 * @Description TODO
 * @ClassName TerminalExpress
 * @Author littlehui
 * @Date 2020/4/10 10:24
 * @Version 1.0
 **/
public class TerminalExpress implements Expression {

    private String data;

    public TerminalExpress(String data){
        this.data = data;
    }

    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
