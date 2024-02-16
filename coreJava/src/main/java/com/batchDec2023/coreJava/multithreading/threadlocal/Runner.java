package com.batchDec2023.coreJava.multithreading.threadlocal;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {


    @SneakyThrows
    public static void main(String[] args) {
        A a  = new A( );

        System.out.println(Thread.currentThread().getName() + " : Value of A.getName() : " + a.getName().get());

        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " : Value of A.getName() : " + a.getName().get());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            a.getName().set("pool-1-thread : Name");
            System.out.println(Thread.currentThread().getName() + " : Value of A.getName() : " + a.getName().get());
        };

        a.getName().set("A-Name");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(task);

        System.out.println(Thread.currentThread().getName() + " : Value of A.getName() : " + a.getName().get());

        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " : Value of A.getName() : " + a.getName().get());
        executorService.shutdown();
    }

}

