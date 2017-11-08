package com.littlehui.design.singleton.six;

/**
 * Created by littlehui on 2017/10/26.
 */
public enum Singleton {
    INSTANCE;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}