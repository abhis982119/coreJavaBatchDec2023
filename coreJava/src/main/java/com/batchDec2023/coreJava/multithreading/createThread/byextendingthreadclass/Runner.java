package com.batchDec2023.coreJava.multithreading.createThread.byextendingthreadclass;

public class Runner {

    public static void main(String[] args) throws  Exception{
        System.out.println("Main thread starts ");

        MyThread thread = new MyThread();
        thread.start();

        System.out.println("Main thread ends ");

        Thread.sleep(8000);
    }
}
