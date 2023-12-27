package com.batchDec2023.coreJava.classelements.staticblock;

public class A {

   static{
       System.out.println("Static blockp-starts");
       m1();
       System.out.println("static-block end ");
    }

    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        System.out.println("A-main() executed");
        A a = new A();
    }

    public static void m1(){
        System.out.println("m1");
    }
}
