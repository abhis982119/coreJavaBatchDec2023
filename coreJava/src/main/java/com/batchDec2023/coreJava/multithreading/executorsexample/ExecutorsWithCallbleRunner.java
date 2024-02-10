package com.batchDec2023.coreJava.multithreading.executorsexample;


import java.util.concurrent.*;

public class ExecutorsWithCallbleRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () -> {
            System.out.println(Thread.currentThread().getName() + "  Running task started ");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + "  Running task end ");
            return "sucess";
        };

        ExecutorService executorService =   Executors.newFixedThreadPool(2);

        Future<String> airlineResultStatus =   executorService.submit(task);

        System.out.println("hitting other airlies for data ");


        System.out.println(airlineResultStatus.get());  //blocking code

        System.out.println("post get  ");


        executorService.shutdown();
    }
}
