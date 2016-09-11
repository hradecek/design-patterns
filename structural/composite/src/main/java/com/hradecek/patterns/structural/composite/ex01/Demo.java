package com.hradecek.patterns.structural.composite.ex01;

class Demo {

    public static void main(String... args) {
        AnimalGang dogGang = new AnimalGang();
        Dog dog = new Dog();
        dogGang.add(dog);
        dogGang.add(dog);
        dogGang.add(dog);

        AnimalGang cowGang = new AnimalGang();
        Cow cow = new Cow();
        cowGang.add(cow);
        cowGang.add(cow);

        AnimalGang allAnimalGang = new AnimalGang();
        allAnimalGang.add(dogGang);
        allAnimalGang.add(cowGang);

        allAnimalGang.makeSound();
    }
}
