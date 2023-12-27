package com.batchDec2023.coreJava.classelements.instanceblock.executiodependsonobjectcreation;



public class A {

    {
        System.out.println("Instance block");
    }

    public A() {
        this(5);
        System.out.println("No arg constructor");
    }

    public A(int a){
        System.out.println("1-arg constructor ");
    }
}
