package com.batchDec2023.coreJava.multithreading.waitandnotify;

public class WaitNotifyCanbeUsedOnlyFromSynchornizedArea {

    public static void main(String[] args) throws InterruptedException {

        Object obj = new Object();
        obj.wait();  // current thread is not owner
        obj.notify(); // current thread is not owner

    }
}
