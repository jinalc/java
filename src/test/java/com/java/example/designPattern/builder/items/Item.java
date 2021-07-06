package com.java.example.designPattern.builder.items;

import com.java.example.designPattern.builder.packaging.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
