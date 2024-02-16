package com.batchDec2023.coreJava.multithreading.volatilekeyword;

public class Runner {

    private static volatile  int a = 0;
    public static void main(String[] args) {



        Thread task1 = new Thread( ()  -> {
            for(int i = 0 ; i < 5 ; i++){
                a++;
            }
        });

        Thread task2 = new Thread( ()  -> {
            for(int i = 0 ; i < 5 ; i++){
                a++;
            }
        });

        new Thread(() -> {
            for (int i = 0; i < 10000; i++){
                System.out.println("value of a : " + a);
            }
        }).start();

        task1.start();
        task2.start();

    }
}
