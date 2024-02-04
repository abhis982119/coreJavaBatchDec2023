package com.batchDec2023.coreJava.multithreading.waysToCreateThread.lambda;

public class OptimizedLambdaRunner {

    public static void main(String[] args) {
        Runnable task =  () -> System.out.println("Thread working.");
        Thread thread = new Thread(task);
        thread.start();

    }
}
