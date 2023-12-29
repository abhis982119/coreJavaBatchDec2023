package com.batchDec2023.coreJava.oops.inheritance.superkeyword;

class Child extends Parent {
    int a = 100;
    int b = 200;

    void m1(int a, int b) //local variables
    {
        System.out.println(a + b); //local variables addition
        System.out.println(this.a + this.b); //current class variables addition
        System.out.println(super.a + super.b); //super class variables addition
    }

    public static void main(String[] args) {
        new Child().m1(1000, 2000);
    }
};