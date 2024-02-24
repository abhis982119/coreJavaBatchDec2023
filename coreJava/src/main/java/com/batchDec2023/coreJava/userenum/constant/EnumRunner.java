package com.batchDec2023.coreJava.userenum.constant;


public class EnumRunner {

    public static void main(String[] args) {

        //We can iterate over all constants
        for(WorkDays weekday : WorkDays.values()){
            System.out.println(weekday);
        }


        //Ordinal : at which position enum is declared
        for(WorkDays workDay : WorkDays.values()){
            System.out.println(workDay.ordinal());
        }

        WorkDays workday = WorkDays.TUESDAY;



        switch(workday){
            case MONDAY:
                System.out.println("Monday called ");
                break;
            case TUESDAY:
                System.out.println("Tuesday called ");
                break;
            default:
                System.out.println("Unmapped weeked / day without case");
                break;
        }


        System.out.println("Is Monday weekday : " + WorkDays.isWorkDay(WorkDays.MONDAY)) ;

    }
}
