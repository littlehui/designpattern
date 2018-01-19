package com.littlehui.design.composite;

import com.littlehui.design.iterate.AnimalIterator;
import com.littlehui.design.iterate.HomeAnimalIterator;
import com.littlehui.design.iterate.IteratorComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by littlehui on 2018/1/18.
 */
public class Duck  extends IteratorAnimal implements AnimalType {

    List<Animal> ducks;

    public Duck() {
        ducks = new ArrayList<Animal>();
        ducks.add(new LocalDuck());
        ducks.add(new ForignDuck());
    }

    public void run() {
        System.out.println("鸭类跑");
    }

    public void each() {
        System.out.println("鸭");
    }

    public AnimalIterator iterator() {
        return new HomeAnimalIterator(ducks);
    }

    public AnimalIterator createIterator() {
        return new IteratorComposite(this.iterator());
    }
}
