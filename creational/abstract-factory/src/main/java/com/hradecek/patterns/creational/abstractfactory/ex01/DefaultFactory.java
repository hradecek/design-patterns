package com.hradecek.patterns.creational.abstractfactory.ex01;

class DefaultFactory implements GuiFactory {

    @Override
    public Button createButton() {
        return new DefaultButton();
    }
}

