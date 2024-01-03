package com.batchDec2023.coreJava.oops.polymorphism.overriding.exceptionthrownshouldbesame;

public class B extends A{
// overridden method does not throw java.lang.Exception
/*    public void m1() throws Exception {
        System.out.println("B-m1()");
    }*/

    @Override
    public void m2(){
        System.out.println("B-m2()");
    }
}
