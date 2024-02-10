package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.method.classlevellock;

import lombok.SneakyThrows;

public class A {

    @SneakyThrows
    public void m1(){
        System.out.println(Thread.currentThread().getName() + " : got lock of A.m1()");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " : release lock of A.m1()");
    }

    @SneakyThrows
    public synchronized  void m2(){  // object-level-lock
        System.out.println(Thread.currentThread().getName() + " : got lock of A.m2()");
        Thread.sleep(8000);
        System.out.println(Thread.currentThread().getName() + " : release lock of A.m2()");
    }

    @SneakyThrows
    public static synchronized  void m3(){    // need :  class-level-lock to execute
        System.out.println(Thread.currentThread().getName() + " : got lock of A.m3()");
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " : release lock of A.m3()");
    }
}
