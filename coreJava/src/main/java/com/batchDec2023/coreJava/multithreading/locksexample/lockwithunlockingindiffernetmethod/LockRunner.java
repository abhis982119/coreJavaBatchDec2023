package com.batchDec2023.coreJava.multithreading.locksexample.lockwithunlockingindiffernetmethod;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class LockRunner {

    @SneakyThrows
    public static void main(String[] args) {

        A a = new A();
        CompletableFuture.runAsync(() -> a.m1());
        CompletableFuture.runAsync(() -> a.m1());

        Thread.sleep(10000);
    }
}
