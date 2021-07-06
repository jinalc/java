package com.java.example.oops;

import com.java.example.oops.customException.InvalidEntryException;
import com.java.example.oops.utility.CurrentLoad;
import com.java.example.oops.utility.SortDevices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class RunnerCalculateCurrentLoad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> mapOfAllDevices;

        try {
            System.out.println(
                    "Enter number of devices switched on at this time (comma separated) : Fan-4, Light-1, Tv-5, Laptop-7");
            String str = sc.nextLine();

            List<String> deviceList = Arrays.asList(str.split("[,]", 0));
            System.out.println("you have selected " + deviceList);
            if (deviceList.size() > 0) {
                mapOfAllDevices = CurrentLoad.createMapOfUserSelectedDevices(deviceList);
                int totalLoad = CurrentLoad.totalPowerConsumptionAtATime(mapOfAllDevices);
                System.out.println("Total power consumption at this time is: " + totalLoad);
                System.out.println();

                System.out.println("Devices sorted by name: ");
                SortDevices.sortByName(mapOfAllDevices);
                System.out.println();

                System.out.println("Devices sorted by power consumption: ");
                SortDevices.sortByPowerConsumption(mapOfAllDevices);
            } else {
                throw new InvalidEntryException("Invalid Input (Fan, Light, TV, Laptop)");
            }

        } catch (InvalidEntryException e) {
            System.out.println("Exception occurred: " + e);
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
