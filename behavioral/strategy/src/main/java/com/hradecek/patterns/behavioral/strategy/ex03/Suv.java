package com.hradecek.patterns.behavioral.strategy.ex03;

class Suv extends Car {

    public Suv() {
        this.brakeBehavior = new BrakeWithAbs();
    }
}
