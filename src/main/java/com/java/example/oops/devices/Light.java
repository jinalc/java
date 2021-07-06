package com.java.example.oops.devices;


import com.java.example.oops.enums.EnumDevices;

public class Light implements Devices {
    public int getDevicePower() {
        return EnumDevices.LIGHT.getPower();
    }

}
