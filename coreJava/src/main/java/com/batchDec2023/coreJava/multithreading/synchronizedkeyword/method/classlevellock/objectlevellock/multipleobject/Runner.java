package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.method.classlevellock.objectlevellock.multipleobject;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        A a3 = new A();

        CompletableFuture.runAsync(() -> a.m1());   // no lock required.
        CompletableFuture.runAsync(() -> a.m1());   // no lock required.
        CompletableFuture.runAsync(() -> a.m2());   // lock required.
        CompletableFuture.runAsync(() -> a2.m2());  // lock required
        CompletableFuture.runAsync(() -> a3.m2());  // lock required for a3 object synchronized area
        CompletableFuture.runAsync(() -> a.m2());  // will wait() for lock on a object synchronized area

        Thread.sleep(11000);

    }
}
