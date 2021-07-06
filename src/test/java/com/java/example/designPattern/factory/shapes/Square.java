package com.java.example.designPattern.factory.shapes;

import com.java.example.designPattern.factory.utils.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
