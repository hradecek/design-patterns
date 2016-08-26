package com.hradecek.patterns.behavioral.strategy.ex02;

class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
