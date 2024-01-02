package com.batchDec2023.coreJava.oops.polymorphism.overloading.operatoroverloading;

/*
 Operator overloading is not allowed in java,
 but there is one implicit overloaded operator [+]

 */
public class DefaultLoadedOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(10 + 20);        // 30
        System.out.println(10 + "" + 20);   //1020
        System.out.println("" + 10  + 20);  //1020
        System.out.println("" + (10  + 20)) ;//30
        System.out.println((10  + 20) + "");//30
            System.out.println(10  + 20 + "" + 10 + 20 ); //301020
    }
}
