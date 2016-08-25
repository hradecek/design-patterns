package com.hradecek.patterns.structural.strategy.ex03;

class Sedan extends Car {

    public Sedan() {
        this.brakeBehavior = new Brake();
    }
}
