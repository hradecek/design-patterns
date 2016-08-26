package com.hradecek.patterns.structural.decorator.ex01;

abstract class CoffeeDecorator implements Coffee {

    protected final Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

