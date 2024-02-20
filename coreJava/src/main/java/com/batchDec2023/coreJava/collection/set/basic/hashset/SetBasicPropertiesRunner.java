package com.batchDec2023.coreJava.collection.set.basic.hashset;

import java.util.*;

public class SetBasicPropertiesRunner {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);

        Set<Integer> set = new HashSet<>();
        for(Integer value  : list){
            set.add(value);
        }

        System.out.println(set);


    }
}
