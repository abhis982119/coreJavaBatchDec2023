package com.batchDec2023.coreJava.exceptionhandling.error;

public class ManualStackOverFlowError {

    public static void main(String[] args) {
        m1(); // Exception in thread "main" java.lang.StackOverflowError
    }

    public static void m1(){
        System.out.println("m1()");
        m1();
    }
}
