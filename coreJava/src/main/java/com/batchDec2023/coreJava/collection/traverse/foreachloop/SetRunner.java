package com.batchDec2023.coreJava.collection.traverse.foreachloop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRunner {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));

        System.out.println(set);

        for(Integer value : set){
            System.out.print(value + ", ");
        }
    }
}
