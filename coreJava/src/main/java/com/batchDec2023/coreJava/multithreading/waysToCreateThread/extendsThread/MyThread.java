package com.batchDec2023.coreJava.multithreading.waysToCreateThread.extendsThread;

public class MyThread extends  Thread{

    @Override
    public void run() {
        System.out.println("Thread working");
    }
}
