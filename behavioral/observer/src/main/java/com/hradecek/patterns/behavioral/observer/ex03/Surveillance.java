package com.hradecek.patterns.behavioral.observer.ex03;

class Surveillance extends CheckList implements AlarmListener {

    public void alarm() {
        System.out.println("Surveillence - by the numbers:");
        byTheNumbers();
    }

    protected void isolate() {
        System.out.println("train the cameras");
    }
}

