package com.batchDec2023.coreJava.oops.inheritance.preventinheritance;

public class Runner {


    public static void main(String[] args) {
        B b = new B();
       // b.m1();

        A a = new A();
            if(a instanceof  Object){
                System.out.println("A is instanceof object");
            }
    }
}
