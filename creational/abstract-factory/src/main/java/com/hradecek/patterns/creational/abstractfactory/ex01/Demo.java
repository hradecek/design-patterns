package com.hradecek.patterns.creational.abstractfactory.ex01;

import java.util.Random;

public class Demo {

    public static void main(String[] args) throws Exception {
        GuiFactory factory = null;
        String os = randomOs();

        if (os.equals("osx")) {
            factory = new OsXFactory();
        } else if (os.equals("windows")) {
            factory = new WinFactory();
        } else {
            factory = new DefaultFactory();
        }

        Button button = factory.createButton();
        button.paint();
    }

    private static String randomOs() {
        String[] oss = { "osx", "windows", "solaris" };

        Random rand = new Random();
        int randNum = rand.nextInt(3);

        return oss[randNum];
    }
}

