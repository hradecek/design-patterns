package com.hradecek.patterns.behavioral.observer.ex03;

public class Demo {
    public static void main(String... args) {
        SensorSystem ss = new SensorSystem();
        ss.register(new Gates());
        ss.register(new Lighting());
        ss.register(new Surveillance());
        ss.soundTheAlarm();
    }
}

