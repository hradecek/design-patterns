package com.hradecek.patterns.structural.strategy.ex02;

class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
