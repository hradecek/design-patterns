package com.hradecek.patterns.creational.abstractfactory.ex02;

import com.hradecek.patterns.creational.abstractfactory.ex02.color.Color;
import com.hradecek.patterns.creational.abstractfactory.ex02.shape.Circle;
import com.hradecek.patterns.creational.abstractfactory.ex02.shape.Rectangle;
import com.hradecek.patterns.creational.abstractfactory.ex02.shape.Shape;
import com.hradecek.patterns.creational.abstractfactory.ex02.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}


