package com.littlehui.design.composite;

import com.littlehui.design.iterate.AnimalIterator;

/**
 * Created by littlehui on 2018/1/18.
 */
public interface Animal {

    public void run();

    public void each();

    public AnimalIterator iterator();
}
