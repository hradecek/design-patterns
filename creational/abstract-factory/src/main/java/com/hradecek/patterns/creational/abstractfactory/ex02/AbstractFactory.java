package com.hradecek.patterns.creational.abstractfactory.ex02;

import com.hradecek.patterns.creational.abstractfactory.ex02.color.Color;
import com.hradecek.patterns.creational.abstractfactory.ex02.shape.Shape;

public abstract class AbstractFactory {
    abstract public Color getColor(String colorType);
    abstract public Shape getShape(String shapeType);
}

