package com.hradecek.patterns.structural.composite.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class AnimalGang implements Animal {

    private List<Animal> animals = new ArrayList<>();

    public void makeSound() {
        Iterator<Animal> it = animals.iterator();
        while(it.hasNext()) {
            Animal animal = it.next();
            animal.makeSound();
        }
    }

    public void add(Animal animal) {
        this.animals.add(animal);
    }

    public void remove(Animal animal) {
        this.animals.remove(animal);
    }
}

