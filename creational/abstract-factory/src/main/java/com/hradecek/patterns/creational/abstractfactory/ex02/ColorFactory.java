package com.hradecek.patterns.creational.abstractfactory.ex02;

import com.hradecek.patterns.creational.abstractfactory.ex02.color.Blue;
import com.hradecek.patterns.creational.abstractfactory.ex02.color.Color;
import com.hradecek.patterns.creational.abstractfactory.ex02.color.Green;
import com.hradecek.patterns.creational.abstractfactory.ex02.color.Red;
import com.hradecek.patterns.creational.abstractfactory.ex02.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();

        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();

        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }
}
