package com.batchDec2023.coreJava.multithreading.threadnames;

public class ThreadNaming {

    public static void main(String[] args) {
        Runnable task = new Runnable(){
          public void run(){
              System.out.println(" Executing thread name : " + Thread.currentThread().getName()); // Thread-0 //default
          }
        };

        Thread thread = new Thread(task);

        Thread airAsiaThread = new Thread(task);
        airAsiaThread.setName("AirAsiaThread");

        System.out.println("Executing thread name : " + Thread.currentThread().getName()); // main
        System.out.println(" thread default name : " + thread.getName()); //Thread-0 //default naming pattern
        System.out.println(" airaisa thread name : " + airAsiaThread.getName());
    }
}
