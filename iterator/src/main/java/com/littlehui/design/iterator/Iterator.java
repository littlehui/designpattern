package com.littlehui.design.iterator;

/**
 * @Description TODO
 * @ClassName Iterator
 * @Author littlehui
 * @Date 2019/10/12 14:56
 * @Version 1.0
 **/
public interface Iterator {

    boolean hasNext();

    Object next();

    void remove();
}
