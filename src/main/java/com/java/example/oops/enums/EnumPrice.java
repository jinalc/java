package com.java.example.oops.enums;

public enum EnumPrice {

    ROSE(1), JASMIN(2), LILY(3);

    private final int flowerPrice;

    public int getPrice() {
        return flowerPrice;
    }

    EnumPrice(int price) {
        this.flowerPrice = price;
    }
}
