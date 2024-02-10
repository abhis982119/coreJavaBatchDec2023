package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.basic.multiplemethodofsameobject;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import javax.sound.midi.Soundbank;

@AllArgsConstructor
public class Juicer {


    private int juicerId;

    @SneakyThrows
    public void extractJuice(String fruit){
        System.out.println(Thread.currentThread().getName() + " peel and chop : " + fruit);
        synchronized (Juicer.class) {  // object-level-lock
            System.out.println(Thread.currentThread().getName() + " Extracting  " + fruit + " juice starts");
            Thread.sleep(10000);
            System.out.println(Thread.currentThread().getName() + " Extracting  " + fruit + " juice ends ");
        }
    }


    @SneakyThrows
    public synchronized  void clean(){
        System.out.println(Thread.currentThread().getName() + " cleaning juicer starts : " + juicerId );
        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + " cleaning juicer ends : " + juicerId );

    }



}
