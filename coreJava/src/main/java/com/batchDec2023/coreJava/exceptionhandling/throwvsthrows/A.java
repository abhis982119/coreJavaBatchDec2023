package com.batchDec2023.coreJava.exceptionhandling.throwvsthrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {

    public void m1() {
        System.out.println("A-m1()");
    }

    /* if you want to use,
      then need to provide alternative implementation
       or us throws keyword
     */
    public void m2() throws  FileNotFoundException, InterruptedException {
        System.out.println("A-m2()");
        FileInputStream inputStream =  new FileInputStream("/abc");
        m3();
    }


    public void m3() throws InterruptedException {
        System.out.println("A-m3()");
        Thread.sleep(3000);
    }
}
