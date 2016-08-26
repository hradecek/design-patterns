package com.hradecek.patterns.structural.decorator.ex01;

class SimpleCoffee implements Coffee {

    @Override
    public String getIngredients() {
        return "Simple and cheap coffee";
    }

    @Override
    public double getCost() {
        return 1.0;
    }
}
