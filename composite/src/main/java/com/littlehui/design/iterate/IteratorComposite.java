package com.littlehui.design.iterate;

import com.littlehui.design.composite.Animal;
import com.littlehui.design.composite.AnimalType;

import java.util.Stack;

/**
 * Created by littlehui on 2018/1/18.
 */
public class IteratorComposite implements AnimalIterator {

    Stack<AnimalIterator> stack = new Stack();

    public IteratorComposite(AnimalIterator iterator) {
        stack.push(iterator);
    }

    public Animal next() {
        if (hasNext()) {
            AnimalIterator iterator = stack.peek();
            Animal animal = iterator.next();
            if (animal instanceof AnimalType) {
                stack.push(animal.iterator());
            }
            return animal;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            AnimalIterator iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
