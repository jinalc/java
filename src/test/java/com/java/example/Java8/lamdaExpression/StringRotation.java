package com.java.example.Java8.lamdaExpression;

import com.java.example.Java8.functionalInterfaces.StringRotationCheck;

public class StringRotation {

    static boolean areRotations(String str1, String str2) {
        return (str1.length() == str2.length()) &&
                ((str1 + str1).contains(str2));

    }

    public static void main(String[] args) {
        String str1 = "ABACD";
        String str2 = "CDABA";

        System.out.println("Without Lambda: ");
        if (areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.println("Strings are not rotations of each other");

        StringRotationCheck b = (s1, s2) -> {
            return (s1.length() == s2.length()) &&
                    ((s1 + s1).contains(s2));
        };

        System.out.println("With Lambda: ");

        if (b.areRotations(str1, str2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.println("Strings are not rotations of each other");

    }
}

