package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.lockofdiffobject;

import java.util.concurrent.CompletableFuture;

public class Runner {

    public static void main(String[] args) {

        JuicerHelper juicerHelper = new JuicerHelper( new Juicer());

        Thread ramesh = new Thread(() -> juicerHelper.extractJuice("mango"));
        ramesh.setName("ramesh");

        Thread sima = new Thread(() -> juicerHelper.extractJuice("apple"));
        sima.setName("sima");

        ramesh.start();
        sima.start();

    }
}
