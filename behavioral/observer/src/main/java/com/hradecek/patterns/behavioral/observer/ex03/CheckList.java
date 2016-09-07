package com.hradecek.patterns.behavioral.observer.ex03;

class CheckList {
    public void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    protected void localize() {
        System.out.println("establish a perimeter");
    }

    protected void isolate() {
        System.out.println("isolate the grid");
    }

    protected void identify() {
        System.out.println("idetify the source");
    }
}

