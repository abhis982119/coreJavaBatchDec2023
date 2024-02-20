package com.batchDec2023.coreJava.collection.set.basic.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(101,352,550, 898, 919);
        System.out.println("list : " + list);


        Set<Integer> set = new HashSet<>(list);
        System.out.println("set : " + set);
    }
}
