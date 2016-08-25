package com.hradecek.patterns.structural.strategy.ex02;

class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
