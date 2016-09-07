package com.hradecek.patterns.behavioral.observer.ex03;

class Lighting implements AlarmListener {
    public void alarm() {
        System.out.println("light up");
    }
}
