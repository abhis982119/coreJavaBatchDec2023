package com.batchDec2023.coreJava.office;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AgeRangeExtractor {

    public static void main(String[] args) {
        String[] inputStrings = {
                "Adult (12+)",
                "Adult (12 - 99 )",
                "Adult",
                "Adult(18+)",
                "Adult(18-99)",
                // ... add more strings as needed
        };

        for (String input : inputStrings) {
            AgeRange ageRange = extractAgeRange(input);
            System.out.println(input + " -> " + ageRange);
        }
    }

    private static AgeRange extractAgeRange(String input) {
        // Define a regular expression pattern to match age-related information
        Pattern pattern = Pattern.compile("(?i)(?:\\((\\d+)\\s*-\\s*(\\d+)\\)|\\((\\d+)\\+\\)|(\\d+))");

        Matcher matcher = pattern.matcher(input);

        int minAge = 0;
        int maxAge = Integer.MAX_VALUE;

        while (matcher.find()) {
            // Check for different capturing groups and update minAge and maxAge accordingly
            if (matcher.group(1) != null && matcher.group(2) != null) {
                minAge = Integer.parseInt(matcher.group(1));
                maxAge = Integer.parseInt(matcher.group(2));
            } else if (matcher.group(3) != null) {
                minAge = Integer.parseInt(matcher.group(3));
                maxAge = Integer.MAX_VALUE;
            } else if (matcher.group(4) != null) {
                minAge = Integer.parseInt(matcher.group(4));
                maxAge = minAge;
            }
        }

        return new AgeRange(minAge, maxAge);
    }

    static class AgeRange {
        int minAge;
        int maxAge;

        public AgeRange(int minAge, int maxAge) {
            this.minAge = minAge;
            this.maxAge = maxAge;
        }

        @Override
        public String toString() {
            return "{" +
                    "minAge=" + minAge +
                    ", maxAge=" + maxAge +
                    '}';
        }
    }
}
