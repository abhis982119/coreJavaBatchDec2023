package com.batchDec2023.coreJava;

import java.util.HashMap;
import java.util.Map;

public class Testing {

    public static void main(String[] args) {
        Map<Character, Integer>  map = new HashMap<>();
        map.put('c',10);
        map.put('d',5);
        map.put('e',15);

       int sum =  map.values().stream().mapToInt(Integer::intValue).sum();


        int sum2  = map.values().parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("sum " + sum );
    }
}
