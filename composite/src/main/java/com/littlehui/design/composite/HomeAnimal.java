package com.littlehui.design.composite;

import com.littlehui.design.iterate.AnimalIterator;
import com.littlehui.design.iterate.HomeAnimalIterator;
import com.littlehui.design.iterate.IteratorComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by littlehui on 2018/1/18.
 */
public class HomeAnimal  extends IteratorAnimal implements AnimalType {

    private List<Animal> homeAnimals = new ArrayList<Animal>();

    public HomeAnimal() {
        homeAnimals.add(new Pig());
        homeAnimals.add(new Bird());
    }

    public void run() {
        System.out.println("家养牲畜跑");
    }

    public void each() {
        System.out.println("家养牲畜跑");
    }

    public AnimalIterator iterator() {
        return new HomeAnimalIterator(homeAnimals);
    }

    public AnimalIterator createIterator() {
        return new IteratorComposite(this.iterator());
    }
}
