package com.batchDec2023.coreJava.oops.polymorphism.overriding.privatevariablecantbeoverriden;

public class Runner {
    public static void main(String[] args) {
        A a = new B();
       // a.m1();     // private methods cannot be access  :
                     // error not of overriding as private method
                    //  are not visible even to their children/ child
                   //  classes, so no-overriding concept comes into play

        B b = new B();
        b.m1();
    }
}
