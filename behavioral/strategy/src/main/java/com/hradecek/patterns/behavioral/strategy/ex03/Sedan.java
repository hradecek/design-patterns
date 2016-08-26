package com.hradecek.patterns.behavioral.strategy.ex03;

class Sedan extends Car {

    public Sedan() {
        this.brakeBehavior = new Brake();
    }
}
