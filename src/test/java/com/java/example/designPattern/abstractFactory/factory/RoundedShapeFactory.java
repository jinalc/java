package com.java.example.designPattern.abstractFactory.factory;

import com.java.example.designPattern.abstractFactory.factory.AbstractFactory;
import com.java.example.designPattern.abstractFactory.shape.RoundedRectangle;
import com.java.example.designPattern.abstractFactory.shape.RoundedSquare;
import com.java.example.designPattern.abstractFactory.shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
