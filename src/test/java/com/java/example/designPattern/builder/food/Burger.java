package com.java.example.designPattern.builder.food;

import com.java.example.designPattern.builder.packaging.Wrapper;
import com.java.example.designPattern.builder.items.Item;
import com.java.example.designPattern.builder.packaging.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
