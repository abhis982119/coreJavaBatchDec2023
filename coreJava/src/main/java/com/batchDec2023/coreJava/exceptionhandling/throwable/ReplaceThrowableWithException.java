package com.batchDec2023.coreJava.exceptionhandling.throwable;

public class ReplaceThrowableWithException {

    public static void main(String[] args) {
        int value = 10;
        try{
            Integer[] arr = new Integer[1000000000]; //Exception in thread "main" java.lang.OutOfMemoryError:
        //    value /= 0;

        }catch (Throwable e){
            System.out.println("Exception  arised : " + e.getMessage());
        }
    }
}
