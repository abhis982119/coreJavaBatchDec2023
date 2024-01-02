package com.batchDec2023.coreJava.oops.inheritance.parentreferencevariable.abc;

public class Runner {

    public static void main(String[] args) {
        B b = new B();
        b.m1();


        A a = new B();
        a.m1();
        // a.m2();  // compileTime error : variable a of type com.batchDec2023.coreJava.oops.inheritance.parentreferencevariable.A

        a.m3();  // static methods don't get overriden as static methods are associated with class

        B.m3();


    }
}
