package com.hradecek.patterns.structural.strategy.ex03;

public class Brake implements BrakeBehavior {

    @Override
    public void brake() {
        System.out.println("Simple brake applied");
    }
}
