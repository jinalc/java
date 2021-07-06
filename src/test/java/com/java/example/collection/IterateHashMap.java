package com.java.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateHashMap {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("Key1", "Value1");
        hashmap.put("Key2", "Value2");

        System.out.println("Iterating or looping map using keySet and 2for each");
        withForEachAndKeySet(hashmap);

        System.out.println("Iterating or looping map using keySet and Iterator");
        withIteratorAndKeySet(hashmap);

        System.out.println("Iterating or looping map using entrySet and for each");
        withForEachAndEntrySet(hashmap);

        System.out.println("Iterating or looping map using entrySet and Iterator");
        withIteratorAndEntrySet(hashmap);
    }

    private static void withForEachAndKeySet(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println("key: " + key + " value: " + hashmap.get(key));
        }
    }

    private static void withIteratorAndKeySet(HashMap<String, String> hashmap) {
        Set<String> keySet = hashmap.keySet();
        Iterator<String> keySetIterator = keySet.iterator();
        while (keySetIterator.hasNext()) {
            String key = keySetIterator.next();
            System.out.println("key: " + key + " value: " + hashmap.get(key));
        }
    }

    private static void withForEachAndEntrySet(HashMap<String, String> hashmap) {
        Set<Map.Entry<String, String>> entrySet = hashmap.entrySet();
        for (Map.Entry entry : entrySet) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

    private static void withIteratorAndEntrySet(HashMap<String, String> hashmap) {
        Set<Map.Entry<String, String>> entrySet1 = hashmap.entrySet();
        Iterator<Map.Entry<String, String>> entrySetIterator = entrySet1.iterator();
        while (entrySetIterator.hasNext()) {
            Map.Entry entry = entrySetIterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }


}
