package com.batchDec2023.coreJava.exceptionhandling.compiletimexception.threadsleep;

public class ThreadSleepCTExceptionExample {

    public static void main(String[] args)  {
        System.out.println("Hello at t0");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Exception arised during sleep ");
        }
        System.out.println("Hello at t4");
    }
}
