package com.batchDec2023.coreJava.multithreading.latches.withoutlatch;

import java.util.concurrent.Callable;

public class GetMarriedWithoutLatch  implements Callable<String> {

    private Thread venueBookThread;

    private Thread chefBookThread;

    public GetMarriedWithoutLatch(Thread venueBookThread, Thread chefBookThread) {
        this.venueBookThread = venueBookThread;
        this.chefBookThread = chefBookThread;
    }


    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " : bride and groom ready to get married.");
        chefBookThread.join();
        venueBookThread.join();
        System.out.println("Marriage completed.");
        return "marriage successfully registered";
    }
}
