package com.batchDec2023.coreJava.multithreading.multiplethreadoutput.usingclasses;

public class Runner {


    public static void main(String[] args) {

        CountToTen countToTenTask = new CountToTen();
        Thread countToTenThread = new Thread(countToTenTask);


        Greet greetTask = new Greet();
        Thread greetThread = new Thread(greetTask);


        countToTenThread.start();
        greetThread.start();

    }
}
