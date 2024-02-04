package com.batchDec2023.coreJava.multithreading.basics.startingThread;

public class OverridingThreadStartMethod {

    public static void main(String[] args) {

        Thread thread = new Thread(){

            @Override
            public void run(){
                System.out.println("Thread working");
            }

            @Override
            public void start(){
                System.out.println("Thread start called");
            }

        };

        thread.start();
    }
}
