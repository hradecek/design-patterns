package com.hradecek.patterns.behavioral.observer.ex02;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}

