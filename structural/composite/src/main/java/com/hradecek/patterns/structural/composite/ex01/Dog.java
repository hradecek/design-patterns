package com.hradecek.patterns.structural.composite.ex01;

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
