package com.java.example.Java8.dateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertToESTTimezone {
    public static void main(String[] args) {
        DateTimeFormatter globalFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma z");
        DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy 'at' hh:mma 'EST'");

        ZoneId istZoneId = ZoneId.of("Asia/Kolkata");
        ZoneId etZoneId = ZoneId.of("America/New_York");

        LocalDateTime currentDateTime = LocalDateTime.now();

        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(etZoneId);

        System.out.println(globalFormat.format(currentISTime));
        System.out.println(etFormat.format(currentETime));
    }
}
