package com.java.example.designPattern.builder.utils;

import com.java.example.designPattern.builder.beverages.Coke;
import com.java.example.designPattern.builder.beverages.Pepsi;
import com.java.example.designPattern.builder.food.ChickenBurger;
import com.java.example.designPattern.builder.food.VegBurger;
import com.java.example.designPattern.builder.utils.Meal;

public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
