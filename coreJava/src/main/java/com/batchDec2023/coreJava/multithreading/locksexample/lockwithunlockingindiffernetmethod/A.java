package com.batchDec2023.coreJava.multithreading.locksexample.lockwithunlockingindiffernetmethod;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class A {


    private Lock lock = new ReentrantLock();

    public void m1(){
        System.out.println(Thread.currentThread().getName() + " : m1() : 1");
        System.out.println(Thread.currentThread().getName() + "  : m1() : 2");

        lock.lock();
        System.out.println(Thread.currentThread().getName() + "  : m1() : 3 Locked ");
        System.out.println(Thread.currentThread().getName() + "  : m1() : 4 ");

        m2();


    }


    @SneakyThrows
    public void m2(){
        System.out.println(Thread.currentThread().getName() + " : m2() : 1");
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + " : m2() : 2 : unlocked");


        lock.unlock();
        System.out.println(Thread.currentThread().getName() + " : m2() : 3");
        System.out.println(Thread.currentThread().getName() + " : m2() : 4");


    }




}
