package com.batchDec2023.coreJava.multithreading.callable;

import lombok.SneakyThrows;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        Runnable runnableTask = () -> {
            int sum = 0;
            for(int i = 0; i < 5 ; i++){
                sum += i;
            }
            System.out.println("total sum : " + sum);
        };

        Callable<Integer>  callableTask = () -> {
            int sum = 0;
            for(int i = 0; i < 5 ; i++){
                sum += i;
            }
            System.out.println("total sum : " + sum);
            return sum;
        };


        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(runnableTask); //ExecutorService working with runnable

        Future<Integer> sumResult = executorService.submit(callableTask);//ExecutorService working with callable
        System.out.println("Result received from callable " + sumResult.get());



        executorService.shutdown();
    }
}
