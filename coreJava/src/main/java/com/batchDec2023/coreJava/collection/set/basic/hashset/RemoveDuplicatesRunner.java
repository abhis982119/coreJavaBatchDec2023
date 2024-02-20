package com.batchDec2023.coreJava.collection.set.basic.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesRunner {

    public static void main(String[] args) {
        int[] arr = new int[]{101,254,365,4231,532,101,254,365,4231,532};
        print(arr);

     //   Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();
        for(int value : arr){
            set.add(value);
        }
        System.out.println(set);

    }

    public static void print(int[] arr){
        for(Integer value : arr){
            System.out.print ( value + ", ");
        }
        System.out.println();
    }
}
