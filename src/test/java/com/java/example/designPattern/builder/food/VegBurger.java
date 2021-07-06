package com.java.example.designPattern.builder.food;

import com.java.example.designPattern.builder.food.Burger;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}