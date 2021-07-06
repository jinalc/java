package com.java.example.Java8.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class CheckDates {

    public static void main(String[] args) {

        LocalDate firstDate = LocalDate.of(2020, 2, 21);
        LocalDate secondDate = LocalDate.of(2020, 2, 20);
        LocalDate thirdDate = LocalDate.of(2020, 2, 21);
        LocalDate fourthDate = LocalDate.of(2020, 2, 22);

        List<LocalDate> dates = new ArrayList<>(Arrays.asList(firstDate, secondDate, thirdDate, fourthDate));
        System.out.println(dates);

        System.out.println("check if the given date is yesterday date");
        LocalDate yesterday = LocalDate.now().minusDays(1);
        Predicate<LocalDate> dateCheck = d -> d.isEqual(yesterday);
        LocalDate randomDate = LocalDate.now().minusDays(new Random().nextInt(30));
        System.out.println(randomDate);
        System.out.println(dateCheck.test(randomDate));

        LocalDate ld = LocalDate.now();
        ld = ld.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println("Next Thursday is: " + ld);

    }
}
