package com.batchDec2023.coreJava.generics;

public class Runner {

    public static void main(String[] args) {
        MyList<Integer>  list = new MyList();
        list.setValue(10);

        System.out.println(list);

        Integer value =  list.getValue();
        System.out.println("value : " + value);
    }
}
