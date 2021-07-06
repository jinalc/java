package com.java.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Fail-Fast iterators immediately throw ConcurrentModificationException if there is structural
// modification of the collection. Structural modification means adding, removing any element
// from collection while a thread is iterating over that collection. Iterator on ArrayList, HashMap
// classes are some examples of fail-fast Iterator.

public class FailFastExample1 {

    public static void main(String[] args) {
        Map<String, String> cityCode = new HashMap<>();
        cityCode.put("Delhi", "India");
        cityCode.put("Moscow", "Russia");
        cityCode.put("New York", "USA");

        Iterator iterator = cityCode.keySet().iterator();

        while (iterator.hasNext()) {
            System.out.println(cityCode.get(iterator.next()));
            cityCode.put("Istanbul", "Turkey");
        }
    }
}
