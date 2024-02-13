package com.batchDec2023.coreJava.multithreading.latches.withoutlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        GetMarriedTask marriedTask = new GetMarriedTask(latch);

        Runnable removeLatches = () -> { latch.countDown();};

        ExecutorService executorService  = Executors.newFixedThreadPool(3);
        executorService.submit(marriedTask);
  /*      executorService.submit(removeLatches);
        executorService.submit(removeLatches);*/
        executorService.shutdown();
    }
}
