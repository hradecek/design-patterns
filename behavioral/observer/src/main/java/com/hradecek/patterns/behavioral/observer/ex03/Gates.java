package com.hradecek.patterns.behavioral.observer.ex03;

class Gates implements AlarmListener {
    public void alarm() {
        System.out.println("gates close");
    }
}

