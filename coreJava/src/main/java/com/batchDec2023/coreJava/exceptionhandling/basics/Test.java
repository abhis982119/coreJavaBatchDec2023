package com.batchDec2023.coreJava.exceptionhandling.basics;

class Test {
    void m1() {
        m2();
    }

    void m2() {
        m3();
    }

    void m3() {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
};