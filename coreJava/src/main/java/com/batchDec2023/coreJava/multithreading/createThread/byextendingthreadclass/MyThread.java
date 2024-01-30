package com.batchDec2023.coreJava.multithreading.createThread.byextendingthreadclass;

import lombok.SneakyThrows;

public class MyThread extends Thread{

    @Override
    @SneakyThrows
    public void run() {
        for(int i = 0; i < 10 ; i++) {
            System.out.println("Running in parallel :  " + i );
            Thread.sleep(2000);
        }
    }
}
