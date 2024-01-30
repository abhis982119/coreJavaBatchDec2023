package com.batchDec2023.coreJava.multithreading.createThread.byrunnable;

public class Runner {

    public static void main(String[] args) throws  Exception{
        System.out.println("Main thread starts ");



        Runnable task = new MyThread();
        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main thread ends ");

        Thread.sleep(8000);

    }
}
