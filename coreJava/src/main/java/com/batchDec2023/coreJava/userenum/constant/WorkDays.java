package com.batchDec2023.coreJava.userenum.constant;

import java.util.HashSet;

public enum WorkDays {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,

    FRIDAY,

    SATURDAY,
    SUNDAY;


    private static HashSet<WorkDays> workDays = new HashSet<>();
    private static HashSet<WorkDays> weekendDays = new HashSet<>();


    static {
        workDays.add(MONDAY);
        workDays.add(TUESDAY);
        workDays.add(WEDNESDAY);
        workDays.add(THURSDAY);
        workDays.add(FRIDAY);
    }

    public static boolean isWorkDay(WorkDays weekday){
        return workDays.contains(weekday);
    }
}
