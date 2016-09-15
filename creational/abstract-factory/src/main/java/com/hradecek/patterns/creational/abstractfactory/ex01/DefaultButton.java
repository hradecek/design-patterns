package com.hradecek.patterns.creational.abstractfactory.ex01;

class DefaultButton implements Button {

    @Override
    public void paint() {
        System.out.println("Ugly Default Button");
    }
}

