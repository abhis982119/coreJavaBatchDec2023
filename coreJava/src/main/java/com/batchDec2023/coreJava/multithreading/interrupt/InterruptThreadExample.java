package com.batchDec2023.coreJava.multithreading.interrupt;

import java.sql.SQLOutput;

public class InterruptThreadExample {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("First Line ");

        Thread thread = new Thread(() -> {    // state-new
            try {                             //state-running
                System.out.println("Thread started work...");
                Thread.sleep(4000);     //sleep
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted during sleep");
            }
        });  //state-end

        thread.start();   //state-ready

        Thread.sleep(1000);
        thread.interrupt();


        System.out.println("Last line");
    }
}
