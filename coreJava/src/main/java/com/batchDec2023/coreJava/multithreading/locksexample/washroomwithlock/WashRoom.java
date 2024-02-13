package com.batchDec2023.coreJava.multithreading.locksexample.washroomwithlock;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WashRoom {

    private Lock washRoomLock = new ReentrantLock();
    private Lock washBasinLock = new ReentrantLock();

    @SneakyThrows
    public  void useToilet(){ // equivalent to synchronzed method
        washRoomLock.lock();

        System.out.println(Thread.currentThread().getName() + " : started using toilet.");
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName() + " : ended using toilet.");

        washRoomLock.unlock();
    }


    @SneakyThrows
    public  void useWashBasin(){ // equivalent to synchronzed block

        System.out.println(Thread.currentThread().getName() + " : started using washBasin.");

        washBasinLock.lock();

        System.out.println(Thread.currentThread().getName() + " : got lock .");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " : released lock");

        washBasinLock.unlock();

        System.out.println(Thread.currentThread().getName() + " : ended using washBasin.");

    }




}
