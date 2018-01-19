package com.littlehui.design.iterate;

import com.littlehui.design.composite.Animal;

/**
 * Created by littlehui on 2018/1/18.
 */
public class NullAnimalIterator implements AnimalIterator {
    public boolean hasNext() {
        return false;
    }

    public Animal next() {
        return null;
    }
}
