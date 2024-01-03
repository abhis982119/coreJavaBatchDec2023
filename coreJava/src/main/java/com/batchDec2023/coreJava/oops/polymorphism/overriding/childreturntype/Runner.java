package com.batchDec2023.coreJava.oops.polymorphism.overriding.childreturntype;

public class Runner {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.getNumber());
    }
}
