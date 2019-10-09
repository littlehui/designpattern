package com.littlehui.design.observer;

/**
 * @Description TODO
 * @ClassName Subject
 * @Author littlehui
 * @Date 2019/10/9 16:34
 * @Version 1.0
 **/
public interface Subject {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void notify(String message);

}
