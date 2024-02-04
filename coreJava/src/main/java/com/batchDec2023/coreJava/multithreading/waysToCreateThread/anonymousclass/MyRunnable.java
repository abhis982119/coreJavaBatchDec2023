package com.batchDec2023.coreJava.multithreading.waysToCreateThread.anonymousclass;

public class MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread working.");
    }
}
