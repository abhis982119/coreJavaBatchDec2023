package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.method.classlevellock;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        A a3 = new A();


        CompletableFuture.runAsync( () -> a.m1() );
        CompletableFuture.runAsync( () -> a.m1() );

    //    CompletableFuture.runAsync( () -> A.m3());
        CompletableFuture.runAsync( () -> A.m3());  //class-level-lock


        CompletableFuture.runAsync(() -> a.m2());  // object-leve-lock on object : a
        CompletableFuture.runAsync(() -> a2.m2()); // object-level lock on object : a2

        Thread.sleep(8000);
    }
}
