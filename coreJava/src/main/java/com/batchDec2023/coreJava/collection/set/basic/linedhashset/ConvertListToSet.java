package com.batchDec2023.coreJava.collection.set.basic.linedhashset;

import java.util.*;

public class ConvertListToSet {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(101,352,550, 898, 919);
        System.out.println("list : " + list);


        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println("set : " + set);
    }
}
