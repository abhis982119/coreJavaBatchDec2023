package com.batchDec2023.coreJava.oops.polymorphism.overloading.methodCall;

public class Math {


    public int add(int a, int b) {
        System.out.println("Int-add(a,b)");
        return a + b;
    }

    public int add(short a, short b) {
        System.out.println("Short-add(a,b)");
        return a + b;
    }

    public int add(byte a, byte b) {
        System.out.println("Byte-add(a,b)");
        return a + b;
    }

    public long add(long a, long b) {
        System.out.println("long-add(a,b)");
        return a + b;
    }


    public float add(float a , float b){
        System.out.println("float-add(a,b)");
        return a+b;
    }
    public double add(double a, double b){
        System.out.println("double-add(a,b)");
        return a+b;
    }

}
