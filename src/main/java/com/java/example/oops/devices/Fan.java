package com.java.example.oops.devices;


import com.java.example.oops.enums.EnumDevices;

public class Fan implements Devices {
    public int getDevicePower() {
        return EnumDevices.FAN.getPower();
    }

}
