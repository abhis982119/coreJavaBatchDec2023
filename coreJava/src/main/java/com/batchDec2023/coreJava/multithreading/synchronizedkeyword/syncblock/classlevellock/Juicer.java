package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.classlevellock;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

@AllArgsConstructor
public class Juicer {


    private int juicerId;

    @SneakyThrows
    public void extractJuice(String fruit){
        System.out.println(Thread.currentThread().getName() + "peel and chop : " + fruit);
        synchronized (Juicer.class) {  // class-level-lock
            System.out.println(Thread.currentThread().getName() + " Extracting  " + fruit + " juice");
            Thread.sleep(10000);
        }
    }




}
