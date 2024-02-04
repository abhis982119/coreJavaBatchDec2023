package com.batchDec2023.coreJava.multithreading.waysToCreateThread.lambda;

public class LamdaRunnerInsideThreadConstructor {

    public static void main(String[] args) {
        //first
        Thread thread = new Thread( () -> System.out.println("Thread working"));
        thread.start();

        //second
        new Thread(() -> System.out.println("Second thread executing")).start();

        //third
        new Thread( () -> {
            System.out.println("thread-3 first line ");
            System.out.println("thred-3 second line");
        }).start();
    }
}
