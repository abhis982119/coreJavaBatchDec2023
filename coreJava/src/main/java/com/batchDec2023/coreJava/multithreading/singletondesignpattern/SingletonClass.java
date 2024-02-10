package com.batchDec2023.coreJava.multithreading.singletondesignpattern;

/*
    Only 1 instance should be created in a machine

    if Object is already created : return object
    if object is null : create object and return
 */

import lombok.Setter;
import lombok.SneakyThrows;

public class SingletonClass {

    private static SingletonClass singletonClass;
    private SingletonClass() {
    }

    public static SingletonClass getInstance(){
        if(singletonClass == null){  //t1, t2, t3
            synchronized (SingletonClass.class) {
                if(singletonClass == null) {  //t2 and t3 will not create object cause already created by t1
                    singletonClass = new SingletonClass();  // t1 will create the object
                }
            }
        }
        return singletonClass;
    }

}
