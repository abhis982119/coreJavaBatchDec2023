package com.batchDec2023.coreJava.multithreading.join;

import lombok.SneakyThrows;

public class BasicRunner {

    public static void main(String[] args) throws Exception {
        Runnable dependentTask = new Runnable() {
            @Override
            @SneakyThrows
            public void run() { //runningt
                System.out.println("Dependent task started ");
                Thread.sleep(3000);
                System.out.println("Dependent task completed");
            }
        }; //dead

        Thread thread = new Thread(dependentTask); //state-new
        thread.start();  //state-ready
        thread.join();  // caller thread will wait until the thread on which join is called is completed


        System.out.println("main thread ends ");

    }
}
