package com.batchDec2023.coreJava.multithreading.executorsexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*

      legacy 1.0                  1.5 Tiger version         1.8 lambda
       Runnable                       Callable                Supplier

  ->   return void               -> return Generic         -> return Generic
  ->   mandates EH               -> throws Exception       -> mandates EH
  ->   No thread reuse           -> ExecutorService,       -> CompletableFuture
                                    Executor

 */
public class ExecutorWithRunnableRunner {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + "  Running task started ");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "  Running task end ");
        };

        ExecutorService executorService =   Executors.newFixedThreadPool(2);

        executorService.submit(task);
        executorService.submit(task);
        executorService.submit(task);

        executorService.shutdown();

    }
}
