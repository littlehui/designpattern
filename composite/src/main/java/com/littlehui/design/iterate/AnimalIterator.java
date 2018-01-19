package com.littlehui.design.iterate;

import com.littlehui.design.composite.Animal;

/**
 * Created by littlehui on 2018/1/18.
 */
public interface AnimalIterator {
    boolean hasNext();
    Animal next();
}
