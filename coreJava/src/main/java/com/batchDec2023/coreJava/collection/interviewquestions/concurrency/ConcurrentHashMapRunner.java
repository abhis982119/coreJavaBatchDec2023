package com.batchDec2023.coreJava.collection.interviewquestions.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapRunner {


    public static void main(String[] args) {

        ConcurrentHashMap<String, String> cities = new ConcurrentHashMap<>();
        cities.put("India", "Delhi");
        cities.put("China", "Beijing");




        System.out.println(cities);

    }
}
