package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.syncblock.washroomexample;

import com.google.gson.annotations.SerializedName;
import lombok.SneakyThrows;

import java.sql.SQLOutput;

/*
 Small office washroom
 1.  Washbasin
 2.  pot
 3.  jetSpray
 4.  toilet-paper

 */
public class Washroom {


    @SneakyThrows
    public synchronized  void useToilet(){  // object-level lock
        System.out.println(Thread.currentThread().getName() + " :  started using toilet"  );
        Thread.sleep(1000);
        washHands(this);
        useJetSpray();
        System.out.println(Thread.currentThread().getName() + " :  ended using toilet"  );
    }

    @SneakyThrows
    public  static synchronized  void washHands(Washroom washroom){  // class-level lock
        System.out.println(Thread.currentThread().getName() + " :  washing started hands ");
        Thread.sleep(2000);
        washroom.useToilet();

        System.out.println(Thread.currentThread().getName() + " : washing started hands ");
    }

    @SneakyThrows
    public synchronized void useJetSpray(){
        System.out.println(Thread.currentThread().getName() + " :  started using jetSpray"  );
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + " :  ended using jetSpray"  );
    }


    public void enterWashRoom(){
        System.out.println(Thread.currentThread().getName() + " entered washroom " );
        System.out.println(Thread.currentThread().getName() + " exited  washroom " );
    }


}
