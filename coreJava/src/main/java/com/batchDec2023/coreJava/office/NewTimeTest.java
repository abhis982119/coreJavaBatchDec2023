package com.batchDec2023.coreJava.office;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class NewTimeTest {

    public static void main(String[] args) {
        Date date = convertToLocalDateTime("Acb");
        System.out.println(date);
    }

    private static Date convertToLocalDateTime(String durationString) {
        try {

            durationString = "PT30M";
            // Parse the duration
            Duration duration = Duration.parse(durationString);

            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();

            // Add the duration to the current date and time
            LocalDateTime newDateTime = currentDateTime.plus(duration);

            // Convert LocalDateTime to java.util.Date
            return Date.from(newDateTime.atZone(java.time.ZoneId.systemDefault()).toInstant());
        } catch (DateTimeParseException e) {
            System.out.println("Invalid duration format: for  " + durationString);
            return null;
        }
    }
}
