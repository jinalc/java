package com.java.example.designPattern.abstractFactory.factory;

import com.java.example.designPattern.abstractFactory.factory.AbstractFactory;
import com.java.example.designPattern.abstractFactory.shape.Rectangle;
import com.java.example.designPattern.abstractFactory.shape.Shape;
import com.java.example.designPattern.abstractFactory.shape.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
