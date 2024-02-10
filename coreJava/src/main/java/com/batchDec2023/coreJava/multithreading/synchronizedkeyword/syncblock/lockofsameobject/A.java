package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.lockofsameobject;

import lombok.SneakyThrows;

public class A {


    public void m1(){
        System.out.println("A-m1()");
    }

    @SneakyThrows
    public synchronized  void  m2(){
        System.out.println(Thread.currentThread().getName()  + " : Non-blocking lines ");
        System.out.println(Thread.currentThread().getName() + " : A-m2() started " );
        Thread.sleep(4000);
        System.out.println(Thread.currentThread().getName() + " : A-m2() ended " );
        System.out.println(Thread.currentThread().getName()  + " : Non-blocking lines ");

        System.out.println();
        System.out.println();
    }

    @SneakyThrows
    public void  m4(){
        System.out.println(Thread.currentThread().getName() + " : A-m4() started " );
        System.out.println(Thread.currentThread().getName()  + " : Non-blocking lines ");
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " : blocking lines started ");
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + " : blocking lines ended ");
        }
        System.out.println(Thread.currentThread().getName()  + " : Non-blocking lines ");
        System.out.println(Thread.currentThread().getName() + " : A-m4() ended " );


        System.out.println();
        System.out.println();
    }
}
