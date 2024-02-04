package com.batchDec2023.coreJava.multithreading.states;

import lombok.SneakyThrows;

public class ThreadStates {

    public static void main(String[] args) {
        Runnable task = new Runnable(){
            @Override
            @SneakyThrows
            public void run(){   // running
                System.out.println("Thread work started");
                Thread.sleep(3000); //waiting
                System.out.println("Thread work ends");
            }
        };// dead

        Thread thread = new Thread(task);  // new
        thread.start();  // ready


    }
}
