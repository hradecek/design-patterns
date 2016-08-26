package com.hradecek.patterns.behavioral.strategy.ex02;

class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
