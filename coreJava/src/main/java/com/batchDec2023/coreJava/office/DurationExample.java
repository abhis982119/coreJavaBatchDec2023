package com.batchDec2023.coreJava.office;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

public class DurationExample {
    public static void main(String[] args) {
        // Examples of max_confirmation_time values
        String duration1 = "PT30M";
        String duration2 = "P0D";

        // Get the new date and time after adding the duration
        LocalDateTime newDateTime1 = addDurationToCurrentTime(duration1);
        LocalDateTime newDateTime2 = addDurationToCurrentTime(duration2);

        // Print the results
        System.out.println("New Date and Time after adding " + duration1 + ": " + newDateTime1);
        System.out.println("New Date and Time after adding " + duration2 + ": " + newDateTime2);
    }

    private static LocalDateTime addDurationToCurrentTime(String durationString) {
        try {
            // Parse the duration
            Duration duration = Duration.parse(durationString);

            // Get the current date and time
            LocalDateTime currentDateTime = LocalDateTime.now();

            // Add the duration to the current date and time
            return currentDateTime.plus(duration);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid duration format: " + durationString);
            return null;
        }
    }



}
