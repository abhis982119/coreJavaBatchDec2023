package com.batchDec2023.coreJava.collection.list.basic;

import java.util.LinkedList;
import java.util.List;

public class GenericsRunner {

    public static void main(String[] args) {
        //  List list = new ArrayList();
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

     //   list.add("String"); // java: no suitable method found for add(java.lang.String)

        list.add(null); // null insertion allowed


        list.add(1); // duplicate allowed



        System.out.println(" insertion order preserved in list : " + list);
    }
}
