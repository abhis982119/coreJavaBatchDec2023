package com.batchDec2023.coreJava.multithreading.waysToCreateThread.anonymousclass;

public class Runner {

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
