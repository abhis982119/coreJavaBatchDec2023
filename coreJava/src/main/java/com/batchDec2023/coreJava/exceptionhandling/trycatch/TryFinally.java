package com.batchDec2023.coreJava.exceptionhandling.trycatch;

/*
   try-catch
   try-finally

 */
public class TryFinally {

    public static void main(String[] args) {
        try{
            System.out.println("try-block");
           // throw new RuntimeException();
        }finally {
            System.out.println("finally-block");
        }
    }
}
