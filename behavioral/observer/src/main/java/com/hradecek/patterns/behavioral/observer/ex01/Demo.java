package com.hradecek.patterns.behavioral.observer.ex01;

import java.util.Observable;
import java.util.Observer;

class Demo {

    public static void main(String... args) {

        System.out.println("Enter text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Received response: " + arg);
            }
        });

        new Thread(eventSource).start();
    }
}

