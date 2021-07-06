package com.java.example.designPattern.abstractFactory;

import com.java.example.designPattern.abstractFactory.factory.AbstractFactory;
import com.java.example.designPattern.abstractFactory.factory.FactoryProducer;
import com.java.example.designPattern.abstractFactory.shape.Shape;

public class RunnerAbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);

        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();

    }
}
