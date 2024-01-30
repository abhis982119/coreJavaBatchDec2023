package com.batchDec2023.coreJava.multithreading.basics.name;

public class ThreadNameRunner {


    public static void main(String[] args) {

        System.out.println("Running thread name : " + Thread.currentThread().getName()); // main thread
        System.out.println("Running thread priority : " + Thread.currentThread().getPriority()); //Default : 5
        System.out.println("Running thread thread-group : " + Thread.currentThread().getThreadGroup()); // main threadGroup

    }
}
