package com.batchDec2023.coreJava.exceptionhandling.basics;

public class Runner {


    public static void main(String[] args) {
        MyMath math = new MyMath();
        try {
            System.out.println(math.divide(10, 2));
            System.out.println(math.divide(10, 0));
        }catch (ArithmeticException e){
            System.out.println("Unable to process your request due to : " + e.getMessage());
        }
    }
}
