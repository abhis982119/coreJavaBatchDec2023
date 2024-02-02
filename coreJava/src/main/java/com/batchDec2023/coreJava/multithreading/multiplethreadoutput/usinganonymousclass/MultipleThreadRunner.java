package com.batchDec2023.coreJava.multithreading.multiplethreadoutput.usinganonymousclass;

import com.batchDec2023.coreJava.multithreading.multiplethreadoutput.usingclasses.CountToTen;
import com.batchDec2023.coreJava.multithreading.multiplethreadoutput.usingclasses.Greet;
import com.batchDec2023.coreJava.multithreading.multiplethreadoutput.usingclasses.Runner;

public class MultipleThreadRunner {

    public static void main(String[] args) {

        Runnable countToTenTask = new Runnable(){
            public void run() {
                for(int i = 0 ;  i < 10  ; i++){
                    //  Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " : "+ i );
                }
            }
        };

        Thread countToTenThread = new Thread(countToTenTask);


        Runnable  greetTask = new Runnable() {
            public void run() {

                for (int i = 0 ; i < 10 ; i++){
                    // Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " : " + "Hello Sima");
                }
            }
        };
        Thread greetThread = new Thread(greetTask);


        countToTenThread.start();
        greetThread.start();
    }
}
