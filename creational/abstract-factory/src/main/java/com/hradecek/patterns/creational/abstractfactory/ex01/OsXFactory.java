package com.hradecek.patterns.creational.abstractfactory.ex01;

class OsXFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new OsXButton();
    }
}

