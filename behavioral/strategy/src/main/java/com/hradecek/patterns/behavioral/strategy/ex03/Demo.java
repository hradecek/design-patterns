package com.hradecek.patterns.behavioral.strategy.ex03;

public class Demo {

    public static void main(String... args) {
        Car sedan = new Sedan();
        sedan.applyBrake();

        Car suv = new Suv();
        suv.applyBrake();

        suv.setBrakeBehavior(new Brake());
        suv.applyBrake();
    }
}
