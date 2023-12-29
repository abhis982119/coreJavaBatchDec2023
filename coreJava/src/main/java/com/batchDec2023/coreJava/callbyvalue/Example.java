package com.batchDec2023.coreJava.callbyvalue;

public class Example {
    public static void main(String[] args) {
        Integer num = new Integer(10);
        System.out.println("Before: " + num);
        
        modifyInteger(num);
        
        System.out.println("After: " + num);
    }

    public static void modifyInteger(Integer value) {
        value = value + 5;
        System.out.println("Inside method: " + value);
    }
}
