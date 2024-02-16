package com.batchDec2023.coreJava.multithreading.atomicpackage;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
public class A {

   // private int count  ;  // 5

    private AtomicInteger count = new AtomicInteger(0);


    public void increment(){
        count.incrementAndGet();
      /* int  c = count;  //t1 and t2
       count = c+1;  // t1*/
    }
}
