package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.lockofdiffobject;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;


public class JuicerHelper {

    private final Juicer juicer;
    private final  String lock = new String();

    public JuicerHelper(Juicer juicer) {
        this.juicer = juicer;
    }
    /*    @SneakyThrows
    public synchronized  void extractJuice(String fruit){
        System.out.println(Thread.currentThread().getName() + "peel and chop : " + fruit);
        System.out.println(Thread.currentThread().getName() + " Extracting  "+ fruit + " juice");
        Thread.sleep(10000);
    }*/

    @SneakyThrows
    public  void extractJuice(String fruit){
        System.out.println(Thread.currentThread().getName() + "peel and chop : " + fruit);
        synchronized (juicer) {
            System.out.println(Thread.currentThread().getName() + " Extracting  " + fruit + " juice");
            Thread.sleep(10000);
        }
    }


        @SneakyThrows
    public  void extractJuiceWithRandomObjectLock(String fruit){
        System.out.println(Thread.currentThread().getName() + "peel and chop : " + fruit);
        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " Extracting  " + fruit + " juice");
            Thread.sleep(10000);
        }
    }



}
