package com.hradecek.patterns.behavioral.strategy.ex02;

class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
