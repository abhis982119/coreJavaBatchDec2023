package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.objectlevellock.singleobject;

public class Runner {

    public static void main(String[] args) {
        A a = new A();

        Thread thread = new Thread(() -> a.m1());  // independent
        Thread thread1 = new Thread(() -> a.m2());
        Thread thread2 = new Thread(() -> a.m2());
        Thread thread3 = new Thread(() -> a.m3());

        Thread thread4 = new Thread(() -> a.m1());


        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();;

        thread4.start();
    }
}
