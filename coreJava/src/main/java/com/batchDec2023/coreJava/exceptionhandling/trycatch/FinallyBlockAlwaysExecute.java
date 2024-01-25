package com.batchDec2023.coreJava.exceptionhandling.trycatch;

public class FinallyBlockAlwaysExecute {

    public static void main(String[] args) {
         try{
             System.out.println("try block executed");
         }catch (Exception e){
             System.out.println("catch block executed ");
         }finally {
             System.out.println("finally block executed ");
         }
    }
}
