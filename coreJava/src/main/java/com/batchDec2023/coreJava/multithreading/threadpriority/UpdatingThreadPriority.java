package com.batchDec2023.coreJava.multithreading.threadpriority;

import com.batchDec2023.coreJava.multithreading.createThread.byrunnable.MyThread;

public class UpdatingThreadPriority {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running task..");
            }
        };

        Thread thread = new Thread(task);

        System.out.println("Thread priority :  " + thread.getPriority()); //5

        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread priority :  " + thread.getPriority()); // 10

    }
}
