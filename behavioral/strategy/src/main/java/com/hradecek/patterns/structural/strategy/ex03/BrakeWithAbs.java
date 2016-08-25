package com.hradecek.patterns.structural.strategy.ex03;

class BrakeWithAbs implements BrakeBehavior {

    @Override
    public void brake() {
        System.out.println("Brake with ABS applied");
    }
}
