package com.littlehui.design.composite;

import com.littlehui.design.iterate.AnimalIterator;

/**
 * Created by littlehui on 2018/1/18.
 */
public class IteratorAnimal implements Animal {

    public IteratorAnimal() {

    }

    public void run() {

    }

    public void each() {

    }

    public AnimalIterator iterator() {
        final IteratorAnimal baseAnimal = this;
        return new AnimalIterator() {
            public boolean hasNext() {
                if (baseAnimal != null ) {
                    return true;
                }
                return false;
            }
            public Animal next() {
                return baseAnimal;
            }
        };
    }
}
