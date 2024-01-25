package com.batchDec2023.coreJava.exceptionhandling.trycatch;

public class TryCatchBasic {

    public static void main(String[] args) {

        try{
            System.out.println("At t0");
            Thread.sleep(3000);
            System.out.println("At t4");
        }catch (InterruptedException e){
            System.out.println("Exception arised " + e.getMessage());
        }
    }
}
