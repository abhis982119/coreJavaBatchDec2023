package com.batchDec2023.coreJava.exceptionhandling.error;

import java.sql.SQLOutput;

public class ManualOutOfMemoryError {

    public static void main(String[] args) {
        Integer[] arr = new Integer[1000000000]; //Exception in thread "main" java.lang.OutOfMemoryError:
    }
}
