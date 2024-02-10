package com.batchDec2023.coreJava.multithreading.producerconsumer;

public class ProducerConsumer {

    private int batchSize = 5;

    private int chipCounter = 0;

    public void produce() throws InterruptedException{
        System.out.println("Producer is called for the first time ");

        while(true) {
            synchronized (this) {
                while (chipCounter < batchSize) {
                    System.out.println("Producer product chip-packet nubmer : " + ++chipCounter);
                    Thread.sleep(1000);
                }
                System.out.println("max chip produced, now moving producer into waiting state");
                notify();  // notify one among waiting threads
                wait();   // waiting state - releasing lock
            }
        }
    }

    public void consume() throws InterruptedException{
        System.out.println("Consumer is called for first time ");

        while(true){
            synchronized (this){
                while(chipCounter > 0){
                    System.out.println("Consuming chip-packet nubmer : " + chipCounter--);
                    Thread.sleep(4000);
                }
                System.out.println("all chips consumed, moving consumer into waiting state");
                notify(); // notify producer
                wait(); // waiting
            }
        }
    }

}
