package com.batchDec2023.coreJava.exceptionhandling.trycatch;

public class TryCatchInCatchBlock {

    public static void main(String[] args) {
        try{
            System.out.println("try-block");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("Inside catch-block");
            try {
                System.out.println("try-block inside catch");
            }catch (Exception ex){
                System.out.println(" catch-block inside catch block");
            }
        }
    }
}
