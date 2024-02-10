package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.washroomexample;

public class Runner {


    public static void main(String[] args) {
        Washroom washroom = new Washroom();
        Thread ramesh = new Thread( () -> washroom.useToilet());
        ramesh.setName("ramesh");
        Thread suresh = new Thread( () -> washroom.useToilet());
        suresh.setName("suresh");

        Thread jayesh = new Thread(() -> washroom.washHands(washroom));
        jayesh.setName("jayesh");

        Thread mahesh = new Thread(() -> washroom.washHands(washroom));
        mahesh.setName("mahesh");

        Thread rahul = new Thread(() -> washroom.enterWashRoom());
        rahul.setName("rahul");


        ramesh.start();
        suresh.start();
        jayesh.start();
        mahesh.start();
        rahul.start();
    }
}
