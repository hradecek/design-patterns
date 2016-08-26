package com.hradecek.patterns.structural.decorator.ex01;

class WithSprinkles extends CoffeeDecorator {

    public WithSprinkles(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sprinkles";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.2;
    }
}
