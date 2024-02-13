package com.batchDec2023.coreJava.multithreading.latches;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LatchExampleModularized {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(2);
        Callable<String> bookVenueTask = getStringCallable(latch);
        Callable<String> bookChefTask = getCallable(latch);
        Callable<String> getMarried = getGetMarried(latch);
   //     Callable<String> getMarried = getGetMarried(bookingVenueThread, bookingChefThread,...,);



        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(bookVenueTask);
        executorService.submit(bookChefTask);
        executorService.submit(getMarried);


        executorService.shutdown();

    }

    private static Callable<String> getGetMarried(CountDownLatch latch) {
        return () -> {
            System.out.println(Thread.currentThread().getName() + " : bride and groom ready to get married.");
            latch.await();
            System.out.println("Marriage completed.");
            return "marriage successfully registered";
        };
    }

    private static Callable<String> getCallable(CountDownLatch latch) {
        return () -> {
            System.out.println(Thread.currentThread().getName() + ": bookChefTask started working.");
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + ": bookChefTask started completed.");
            latch.countDown();
            return "chef booked : success";
        };
    }

    private static Callable<String> getStringCallable(CountDownLatch latch) {
        return () -> {
            System.out.println(Thread.currentThread().getName() + ": bookVenueTask  started working.");
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + ": bookVenueTask  started completed.");

            latch.countDown();
            return "venue booked : success";
        };
    }
}
