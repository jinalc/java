package com.java.example.oops.devices;


import com.java.example.oops.enums.EnumDevices;

public class TV implements Devices {
    public int getDevicePower() {
        return EnumDevices.TV.getPower();
    }

}
