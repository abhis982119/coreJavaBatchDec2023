package com.batchDec2023.coreJava.multithreading.singletondesignpattern;

public class Runner {

    public static void main(String[] args) {
       SingletonClass singletonClass1 =  SingletonClass.getInstance();
        SingletonClass singletonClass2 =  SingletonClass.getInstance();

        System.out.println(singletonClass1);
        System.out.println(singletonClass2);


        System.out.println("Same instance :  " + (singletonClass1 == singletonClass2) );






    }
}
