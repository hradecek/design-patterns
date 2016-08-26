package com.hradecek.patterns.behavioral.strategy.ex02;

class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
