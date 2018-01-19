package com.littlehui.design.iterate;

import com.littlehui.design.composite.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by littlehui on 2018/1/18.
 */
public class HomeAnimalIterator implements AnimalIterator {

    List<Animal> animals = new ArrayList<Animal>();

    int index = 0;

    public HomeAnimalIterator(List<Animal> animals) {
        this.animals = animals;
    }

    public boolean hasNext() {
        if (animals != null && animals.size() > index) {
            return true;
        }
        return false;
    }

    public Animal next() {
        Animal animal = animals.get(index);
        index ++;
        return animal;
    }
}
