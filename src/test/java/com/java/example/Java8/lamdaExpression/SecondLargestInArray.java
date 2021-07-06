package com.java.example.Java8.lamdaExpression;

import com.java.example.Java8.functionalInterfaces.SecondLargestInArrayCheck;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestInArray {

    public static int getSecondLargest(Integer[] a, int total) {
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        return list.get(total - 2);
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 5, 6, 3, 2};
        Integer[] b = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Second Largest: " + getSecondLargest(a, a.length));
        System.out.println("Second Largest: " + getSecondLargest(b, b.length));

        SecondLargestInArrayCheck check = (s, t) -> {
            List<Integer> list = Arrays.asList(s);
            Collections.sort(list);
            return list.get(t - 2);
        };

        System.out.println("Second Largest using lambda: " + check.getSecondLargest(a, a.length));
        System.out.println("Second Largest using lambda: " + check.getSecondLargest(b, b.length));
    }
}
