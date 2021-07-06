package com.java.example.oops.enums;

public enum EnumDevices {

    LIGHT(1), TV(5), LAPTOP(7), FAN(4);

    private final int powerConsumption;

    public int getPower() {
        return powerConsumption;
    }

    EnumDevices(int power) {
        this.powerConsumption = power;
    }
}
