package com.java.example.Java8.dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(1993, 12, 17);
        LocalDate end = LocalDate.now();
        long years = ChronoUnit.YEARS.between(start, end);
        System.out.println("Age is: " + years);
    }
}
