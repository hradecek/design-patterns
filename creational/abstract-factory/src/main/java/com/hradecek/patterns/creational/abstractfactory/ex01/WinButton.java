package com.hradecek.patterns.creational.abstractfactory.ex01;

class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button");
    }
}

