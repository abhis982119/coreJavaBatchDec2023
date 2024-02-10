package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.classlevellock;

public class Runner {

    public static void main(String[] args) {
        Juicer juicer1 = new Juicer(1);
        Juicer juicer2 = new Juicer(2);


        Thread ramesh = new Thread( () -> juicer1.extractJuice("Mango"));
        ramesh.setName("ramesh");

        Thread sima = new Thread( () -> juicer2.extractJuice("Apple"));
        sima.setName("sima");


        ramesh.start();
        sima.start();


    }
}
