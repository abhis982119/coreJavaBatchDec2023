package com.batchDec2023.coreJava.multithreading.multiplethreadoutput.usingclasses;

import lombok.SneakyThrows;

public class Greet implements Runnable{
    @Override
    @SneakyThrows
    public void run() {

        for (int i = 0 ; i < 10 ; i++){
           // Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : " + "Hello Sima");
        }
    }
}
