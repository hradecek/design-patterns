package com.hradecek.patterns.creational.abstractfactory.ex01;

class OsXButton implements Button {

    @Override
    public void paint() {
        System.out.println("OS X Button");
    }
}

