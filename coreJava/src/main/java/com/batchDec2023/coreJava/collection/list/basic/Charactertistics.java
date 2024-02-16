package com.batchDec2023.coreJava.collection.list.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Charactertistics {


    public static void main(String[] args) {

    //  List list = new ArrayList();
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        list.add("String"); // heterogenous data allowed

        list.add(null); // null insertion allowed


        list.add(1); // duplicate allowed



        System.out.println(" insertion order preserved in list : " + list);
    }
}
