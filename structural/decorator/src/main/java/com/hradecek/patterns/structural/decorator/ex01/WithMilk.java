package com.hradecek.patterns.structural.decorator.ex01;

class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
