package com.batchDec2023.coreJava.multithreading.interrupt;

public class ThreadInterruptedWithoutSleep {


    public static void main(String[] args) throws  InterruptedException {
        System.out.println(Thread.currentThread().getName() +  " task starts");

        Thread thread = new Thread( () -> System.out.println("Thread work started"));

        thread.start();
        Thread.sleep(1000);
        thread.interrupt();  // ignored, cause thread is not sleeping
        thread.interrupt();  // ignored, cause thread is not sleeping

        System.out.println(Thread.currentThread().getName() +  " task ends");
    }
}
