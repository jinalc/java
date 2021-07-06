package com.java.example.oops.utility;

import com.java.example.oops.devices.Fan;
import com.java.example.oops.devices.Laptop;
import com.java.example.oops.devices.Light;
import com.java.example.oops.devices.TV;
import com.java.example.oops.enums.EnumDevices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrentLoad {
    public static HashMap<String, Integer> createMapOfUserSelectedDevices(List<String> deviceList) {

        HashMap<String, Integer> mapOfAllDevices = new HashMap<>();
        for (String app : deviceList) {
            if (app.trim().equalsIgnoreCase(EnumDevices.FAN.toString())) {
                Fan fan = new Fan();
                mapOfAllDevices.put(EnumDevices.FAN.toString(), fan.getDevicePower());
            } else if (app.trim().equalsIgnoreCase(EnumDevices.LIGHT.toString())) {
                Light light = new Light();
                mapOfAllDevices.put(EnumDevices.LIGHT.toString(), light.getDevicePower());
            } else if (app.trim().equalsIgnoreCase(EnumDevices.TV.toString())) {
                TV tV = new TV();
                mapOfAllDevices.put(EnumDevices.TV.toString(), tV.getDevicePower());
            } else if (app.trim().equalsIgnoreCase(EnumDevices.LAPTOP.toString())) {
                Laptop laptop = new Laptop();
                mapOfAllDevices.put(EnumDevices.LAPTOP.toString(), laptop.getDevicePower());
            } else
                System.out.println("Enter valid device names (fan, light, tv, laptop)");
        }
        return mapOfAllDevices;
    }


    public static int totalPowerConsumptionAtATime(HashMap<String, Integer> mapOfAllDevices) {
        int total = 0;

        for (Map.Entry<String, Integer> entry : mapOfAllDevices.entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}

