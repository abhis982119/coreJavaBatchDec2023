package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.method.classlevellock.objectlevellock.multipleobject;

import lombok.SneakyThrows;

public class A {


    @SneakyThrows
    public void m1(){
        System.out.println(Thread.currentThread().getName() + "A-m1() - starts ");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + "A-m1() - ends  ");
    }

    @SneakyThrows
    public synchronized void m2(){
        System.out.println( Thread.currentThread().getName() + " : syncA-m2() - starts ");
        Thread.sleep(10000);
        System.out.println(Thread.currentThread().getName() + "syncA-m2() - ends ");
    }

    @SneakyThrows
    public synchronized  void m3(){
        System.out.println(Thread.currentThread().getName() + "syncA-m3()");
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + "syncA-m3()");
    }
}
