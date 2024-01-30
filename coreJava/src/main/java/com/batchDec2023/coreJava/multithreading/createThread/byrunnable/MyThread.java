package com.batchDec2023.coreJava.multithreading.createThread.byrunnable;

import lombok.SneakyThrows;

public class MyThread implements Runnable{
    @Override
    @SneakyThrows
    public void run() {
        for(int i = 0; i < 10 ; i++) {
            System.out.println("Running in parallel :  " + i );
            Thread.sleep(2000);
        }
    }
}
