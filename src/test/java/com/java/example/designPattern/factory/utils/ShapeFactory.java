package com.java.example.designPattern.factory.utils;

import com.java.example.designPattern.factory.shapes.Circle;
import com.java.example.designPattern.factory.shapes.Rectangle;
import com.java.example.designPattern.factory.shapes.Square;
import com.java.example.designPattern.factory.utils.Shape;

public class ShapeFactory {
    //use getShape method to get object of type shape
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
}
