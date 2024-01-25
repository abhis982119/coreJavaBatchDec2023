package com.batchDec2023.coreJava.exceptionhandling.trycatch;

public class TryWithMultipleExceptionSameBody {

    public static void main(String[] args) {
        Integer value = 0;
        try {
                value = value/0;
                Thread.sleep(3000);
        }catch (ArithmeticException  | NullPointerException | InterruptedException  e){
            System.out.println("Exception arised " + e.getMessage());
        }catch (Exception e){
            System.out.println("Unknown exception  : " + e.getMessage());
        }
    }
}
