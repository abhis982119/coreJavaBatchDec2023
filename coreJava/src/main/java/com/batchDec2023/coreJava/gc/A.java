package com.batchDec2023.coreJava.gc;

public class A  {

    @Override
    protected void finalize() {
        System.out.println("A object deleted");
    }

}
