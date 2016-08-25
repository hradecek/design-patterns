package com.hradecek.patterns.structural.strategy.ex02;

class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
