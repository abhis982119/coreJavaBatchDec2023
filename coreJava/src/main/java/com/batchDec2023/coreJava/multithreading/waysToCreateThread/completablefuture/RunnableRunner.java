package com.batchDec2023.coreJava.multithreading.waysToCreateThread.completablefuture;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class RunnableRunner {

    @SneakyThrows
    public static void main(String[] args) {

        CompletableFuture.runAsync(() -> System.out.println("This is my task "));

        Thread.sleep(3000);

    }
}
