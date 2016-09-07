package com.hradecek.patterns.behavioral.observer.ex03;

import java.util.Enumeration;
import java.util.Vector;

class SensorSystem {

    private Vector listeners = new Vector();

    public void register(AlarmListener al) {
        listeners.addElement(al);
    }

    public void soundTheAlarm() {
        for (Enumeration e = listeners.elements(); e.hasMoreElements();) {
            ((AlarmListener) e.nextElement()).alarm();
        }
    }
}
