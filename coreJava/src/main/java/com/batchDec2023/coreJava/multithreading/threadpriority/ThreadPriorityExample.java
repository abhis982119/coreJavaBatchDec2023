package com.batchDec2023.coreJava.multithreading.threadpriority;

import com.batchDec2023.coreJava.multithreading.createThread.byrunnable.MyThread;

import java.sql.SQLOutput;

public class ThreadPriorityExample {

    public static void main(String[] args) throws InterruptedException {
        //Thread thread = new Thread();
        Thread thread = new Thread(){
            public void run() {
                System.out.println("fetch AirAisa flight result ");
            }
        };

        System.out.println("Thread.MAX_PRIORITY  : " + Thread.MAX_PRIORITY);
        System.out.println("Thread.NORM_PRIORITY : " + Thread.NORM_PRIORITY);
        System.out.println("Thread.MIN_PRIORITY  : " + Thread.MIN_PRIORITY);

        System.out.println( Thread.currentThread().getName() + " : " + Thread.currentThread().getPriority()); // main thread default priority is 5
        System.out.println( thread.getName() + " : " +  thread.getPriority());  // default priority is of thread which created it.

    }
}
