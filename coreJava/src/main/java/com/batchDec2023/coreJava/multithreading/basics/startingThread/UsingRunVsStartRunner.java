package com.batchDec2023.coreJava.multithreading.basics.startingThread;

public class UsingRunVsStartRunner {

    public static void main(String[] args) {
        Runnable task = () -> System.out.println( Thread.currentThread().getName() + " : Thread running");
        Thread thread = new Thread(task);

        thread.run();     // it's like normal method call
        thread.start();   // Register thread in thread scheduler
    }
}
