package com.java.example.designPattern.builder.beverages;

import com.java.example.designPattern.builder.items.Item;
import com.java.example.designPattern.builder.packaging.Packing;
import com.java.example.designPattern.builder.packaging.Bottle;

public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}