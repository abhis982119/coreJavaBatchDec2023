package com.batchDec2023.coreJava.multithreading.waysToCreateThread.implementRunnable;

public class Runner {

    public static void main(String[] args) {

        Thread thread = new Thread(){

            @Override
            public void run(){
                System.out.println("Thread working.");
            }
        };

        thread.start();
    }
}
