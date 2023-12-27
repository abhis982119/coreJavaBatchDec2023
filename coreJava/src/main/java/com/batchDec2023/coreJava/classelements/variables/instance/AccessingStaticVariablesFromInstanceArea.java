package com.batchDec2023.coreJava.classelements.variables.instance;

public class AccessingStaticVariablesFromInstanceArea {

    private static int  a = 10;  //static variable
    private int b = 20;
    public static void main(String[] args) {
        System.out.println(a);
     // System.out.println(b); //non-static variable b cannot be referenced from a static context
    }

    public void m1(){
        System.out.println(a);
    }
}
