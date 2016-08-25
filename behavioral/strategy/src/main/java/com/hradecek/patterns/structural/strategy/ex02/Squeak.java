package com.hradecek.patterns.structural.strategy.ex02;

class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
