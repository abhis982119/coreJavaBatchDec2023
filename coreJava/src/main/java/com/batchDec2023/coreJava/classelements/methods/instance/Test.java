package com.batchDec2023.coreJava.classelements.methods.instance;

class Test {


    void m1() {
        m2(); //m2() method calling
        System.out.println("m1");
        m2(); //m2() method calling
    }

    void m2() {
        m3(100); //m3() method calling
        System.out.println("m2 ");
        m3(200); //m3() method calling
    }

    void m3(int a) {
        System.out.println("m3 ");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.m1(); //m1() method calling
    }
}
