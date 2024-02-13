package com.batchDec2023.coreJava.multithreading.latches.withoutlatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class GetMarriedTask implements Callable<String> {

    private CountDownLatch latch;

    public GetMarriedTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public String call() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " : bride and groom ready to get married.");
        latch.await();
        System.out.println("Marriage completed.");
        return "marriage successfully registered";
    }
}
