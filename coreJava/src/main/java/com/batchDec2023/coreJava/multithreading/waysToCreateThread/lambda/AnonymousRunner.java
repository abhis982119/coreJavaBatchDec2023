package com.batchDec2023.coreJava.multithreading.waysToCreateThread.lambda;

public class AnonymousRunner {

    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread working.");
            }
        };

        Thread thread = new Thread(task);
        thread.start();

    }
}
