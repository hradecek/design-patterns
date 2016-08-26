package com.hradecek.patterns.behavioral.strategy.ex02;

class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
