package com.java.example.designPattern.builder.food;

import com.java.example.designPattern.builder.food.Burger;

public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}