package com.batchDec2023.coreJava.office;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringIntegerFinder {

    public static void main(String[] args) {
        String ageString = "Child (3:10)";
        List<Integer> ageRange = getAllIntegersInString(ageString, false);
        System.out.println(ageRange);
    }

    public static List<Integer> getAllIntegersInString(String str, boolean allowFormattedNumbers) {
        if (str == null) {
            return new ArrayList<>(0);
        }

        List<Integer> numbers = new ArrayList<>();
        if (allowFormattedNumbers) {
            str = str.replaceAll(",", "");
        }

        Matcher m = Pattern.compile("-?\\d+").matcher(str);
        while (m.find()) {
            numbers.add(Integer.parseInt(m.group()));
        }

        return numbers;
    }
}
