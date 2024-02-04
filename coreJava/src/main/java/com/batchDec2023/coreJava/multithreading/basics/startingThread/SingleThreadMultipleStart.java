package com.batchDec2023.coreJava.multithreading.basics.startingThread;

public class SingleThreadMultipleStart {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Thread running");
        Thread thread = new Thread(task);
        thread.start();
        thread.start(); // Exception in thread "main" java.lang.IllegalThreadStateException
    }
}
