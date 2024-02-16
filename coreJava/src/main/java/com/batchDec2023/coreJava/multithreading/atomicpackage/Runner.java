package com.batchDec2023.coreJava.multithreading.atomicpackage;

import lombok.SneakyThrows;

import java.sql.SQLOutput;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {

        A a = new A();
        ExecutorService executorService = Executors.newFixedThreadPool(1000);

        CyclicBarrier barrier = new CyclicBarrier(1000, () -> System.out.println("**** Barrier broken ****"));
        Runnable task = () -> {
            try {

                barrier.await();
                a.increment();
                System.out.println(Thread.currentThread().getName() + " : incremented value ");
            } catch (InterruptedException | BrokenBarrierException e) {
                System.out.println("Exception arised");
                throw new RuntimeException(e);
            }

        };
        for (int i = 0; i < 1000; i++) {

            executorService.submit(task);
        }

        Thread.sleep(5000);
        System.out.println("Value of A : " + a.getCount());
        executorService.shutdown();
    }
}
