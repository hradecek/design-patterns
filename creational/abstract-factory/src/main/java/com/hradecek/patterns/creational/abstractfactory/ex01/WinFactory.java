package com.hradecek.patterns.creational.abstractfactory.ex01;

class WinFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }
}

