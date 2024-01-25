package com.batchDec2023.coreJava.exceptionhandling.basics;

public class ManualRaiseExceptionArithmetic {


    public static void main(String[] args) {

        System.out.println("First line");
        System.out.println("Second line");
        System.out.println("Third line");
        System.out.println("Fouth line");
        System.out.println("Fifth line");
        int previousAcccount_balance = 1000;
        int a = previousAcccount_balance + (10/0); //ArithmeticException: / by zero
        System.out.println("saving account balance " + a);
        System.out.println("Sixth line");
        System.out.println("Seventh line");
        System.out.println("Eight line");
        System.out.println("Ninth line");
        System.out.println("Tenth line");
    }
}
