package com.java.example.oops.utility;

import java.util.*;

public class SortDevices {

    public static void sortByName(HashMap<String, Integer> map2) {

        // put all items in tree map to sort in natural order
        TreeMap<String, Integer> sorted = new TreeMap<>(map2);

        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println("Device = " + entry.getKey() + ", Power Consumption = " + entry.getValue());
        }
    }

    public static void sortByPowerConsumption(HashMap<String, Integer> map2) {

        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map2.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // put data from sorted list to hash map
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }

        for (Map.Entry<String, Integer> entry : temp.entrySet()) {
            System.out.println("Device = " + entry.getKey() + ", Power Consumption = " + entry.getValue());
        }

    }
}
