package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.objectlevellock.multipleobject;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        A a3 = new A();

        CompletableFuture.runAsync(() -> a.m1());  // not dependent
        CompletableFuture.runAsync(() -> a.m1()); // not dependent
        CompletableFuture.runAsync(() -> a.m2());
        CompletableFuture.runAsync(() -> a2.m2());
        CompletableFuture.runAsync(() -> a3.m2());

        Thread.sleep(11000);

    }
}
