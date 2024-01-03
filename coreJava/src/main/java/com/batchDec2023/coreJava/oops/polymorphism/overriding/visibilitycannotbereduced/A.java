package com.batchDec2023.coreJava.oops.polymorphism.overriding.visibilitycannotbereduced;
/*
   public > protected > default > private
 */
public class A {

    public void m1(){
        System.out.println("A-m1()");
    }


    protected void m2(){
        System.out.println("A-m2()");
    }
}
