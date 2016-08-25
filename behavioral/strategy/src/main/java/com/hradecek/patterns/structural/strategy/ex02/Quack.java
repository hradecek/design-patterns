package com.hradecek.patterns.structural.strategy.ex02;

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
