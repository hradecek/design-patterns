package com.hradecek.patterns.structural.strategy.ex01;

class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
