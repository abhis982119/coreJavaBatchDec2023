package com.batchDec2023.coreJava.collection.map.bascis.linkedhashmap;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class GenericMapRunner {

    public static void main(String[] args) {

        Map<String,String> cities = new LinkedHashMap<>();
        cities.put("India","Delhi");
        cities.put("China","Beijing");
        cities.put("USA", "Washington D.C");
        cities.put("India","New Delhi");  //update

        System.out.println(cities);

        System.out.println( cities.get("India"));
    }
}
