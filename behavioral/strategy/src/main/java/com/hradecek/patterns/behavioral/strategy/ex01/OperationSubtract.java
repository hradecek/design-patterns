package com.hradecek.patterns.behavioral.strategy.ex01;

class OperationSubtract implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
