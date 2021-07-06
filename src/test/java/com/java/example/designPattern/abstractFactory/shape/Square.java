package com.java.example.designPattern.abstractFactory.shape;

import com.java.example.designPattern.abstractFactory.shape.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
