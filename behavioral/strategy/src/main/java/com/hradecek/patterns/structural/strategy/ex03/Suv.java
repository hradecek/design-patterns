package com.hradecek.patterns.structural.strategy.ex03;

class Suv extends Car {

    public Suv() {
        this.brakeBehavior = new BrakeWithAbs();
    }
}
