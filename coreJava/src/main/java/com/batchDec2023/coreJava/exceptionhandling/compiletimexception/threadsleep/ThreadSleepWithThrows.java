package com.batchDec2023.coreJava.exceptionhandling.compiletimexception.threadsleep;

public class ThreadSleepWithThrows {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello at t0");
        Thread.sleep(3000);
        System.out.println("Hello at t4");
    }
}
