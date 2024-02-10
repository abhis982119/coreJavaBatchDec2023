package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.lockofsameobject;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class BasicRunner {

    @SneakyThrows
    public static void main(String[] args) {

        A a = new A();
  /*      CompletableFuture.runAsync(() -> a.m2());
        CompletableFuture.runAsync(() -> a.m2());
*/

        CompletableFuture.runAsync(() -> a.m4());
        CompletableFuture.runAsync(() -> a.m4());
        Thread.sleep(22000);
    }
}
