package com.batchDec2023.coreJava.exceptionhandling.trycatch.returnvalue.trycatchfinally;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        System.out.println("A-m1() : " + a.m1()); //130
        System.out.println("A-m2() : " + a.m2()); //130  //  110
        System.out.println("A-m3() : " + a.m3()); //110  //  130
    }
}
