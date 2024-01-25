package com.batchDec2023.coreJava.exceptionhandling.trycatch;

public class TryCatchFinallyWithException {

    public static void main(String[] args) {
        try{
            System.out.println("try block executed");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("catch block executed ");
        }finally {
            System.out.println("finally block executed ");
        }
    }
}
