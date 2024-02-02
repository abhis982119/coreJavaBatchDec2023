package com.batchDec2023.coreJava.multithreading.threadpriority;

public class PrioirtyValueOutOfRange {

    public static void main(String[] args) {
        Runnable task =  new Runnable() {
            @Override
            public void run() {
                System.out.println("task running...");
            }
        };

        Thread thread = new Thread(task);
        System.out.println("Thread priority : " + thread.getPriority()); // 5

        thread.setPriority(21);  // IllegalArgumentException

        System.out.println("Thread priority : " + thread.getPriority());

    }
}
