package com.batchDec2023.coreJava.multithreading.barrier;




import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarrierRunner {

    public static void main(String[] args) {

        int numberOfPlayer = 5;
//        CyclicBarrier barrier = new CyclicBarrier(numberOfPlayer);

          Runnable barrierBrokenTask = () -> {
              System.out.println(" ************* Start the RACE (BARRIER BROKEN) ***********");
          };

          CyclicBarrier barrier = new CyclicBarrier(numberOfPlayer,barrierBrokenTask );

        Callable<String> raceTask = () -> {
            System.out.println(Thread.currentThread().getName() + " : ready to  race");
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " : completed race");
            return "";
        };

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for( int i = 0; i < numberOfPlayer; i++){
            executorService.submit(raceTask);
        }

        executorService.shutdown();
    }
}
