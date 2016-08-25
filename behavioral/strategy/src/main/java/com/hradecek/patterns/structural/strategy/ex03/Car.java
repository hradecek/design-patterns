package com.hradecek.patterns.structural.strategy.ex03;

abstract class Car {

    protected BrakeBehavior brakeBehavior;

    public void applyBrake() {
        brakeBehavior.brake();
    }

    public void setBrakeBehavior(BrakeBehavior brakeBehavior) {
        this.brakeBehavior = brakeBehavior;
    }
}
