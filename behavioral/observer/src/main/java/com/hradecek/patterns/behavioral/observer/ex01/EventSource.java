package com.hradecek.patterns.behavioral.observer.ex01;

import java.util.Observable;
import java.util.Scanner;

class EventSource extends Observable implements Runnable {

    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}
