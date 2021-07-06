package com.java.example.designPattern.abstractFactory.factory;

import com.java.example.designPattern.abstractFactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}