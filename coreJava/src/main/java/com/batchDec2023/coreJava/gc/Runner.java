package com.batchDec2023.coreJava.gc;

public class Runner {

    public static void main(String[] args) throws Exception {
      //  A a = new A();
        int a  = 1;
        int b = 2;
        int c= 3;
        System.gc();  // it can only request JVM to start GC
        Thread.sleep(4000);


    }

}
