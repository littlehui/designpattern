package com.littlehui.design.composite;

import com.littlehui.design.iterate.AnimalIterator;

/**
 * Created by littlehui on 2018/1/18.
 */
public class Client {

    public static void main(String[] args) {
        HomeAnimal homeAnimal = new HomeAnimal();

        AnimalIterator homeAnimalIterator = homeAnimal.createIterator();
        while (homeAnimalIterator.hasNext()) {
            Animal animal = homeAnimalIterator.next();
            animal.run();
        }
    }
}