package com.java.example.designPattern.factory.shapes;

import com.java.example.designPattern.factory.utils.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
