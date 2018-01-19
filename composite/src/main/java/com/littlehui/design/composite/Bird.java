package com.littlehui.design.composite;

import com.littlehui.design.iterate.AnimalIterator;
import com.littlehui.design.iterate.HomeAnimalIterator;
import com.littlehui.design.iterate.IteratorComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by littlehui on 2018/1/18.
 */
public class Bird extends IteratorAnimal implements AnimalType {

    List<Animal> birds;

    public Bird() {
        this.birds = new ArrayList<Animal>();
        birds.add(new Chicken());
        birds.add(new Duck());
    }

    public void run() {
        System.out.println("鸟类跑");
    }

    public void each() {
        for (Animal animal : birds) {
            animal.each();
        }
    }

    public AnimalIterator iterator() {
       return new HomeAnimalIterator(birds);
    }

    public AnimalIterator createIterator() {
        return new IteratorComposite(this.iterator());
    }
}
