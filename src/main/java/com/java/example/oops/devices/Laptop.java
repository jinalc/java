package com.java.example.oops.devices;


import com.java.example.oops.enums.EnumDevices;

public class Laptop implements Devices {
    public int getDevicePower() {
        return EnumDevices.LAPTOP.getPower();
    }

}
