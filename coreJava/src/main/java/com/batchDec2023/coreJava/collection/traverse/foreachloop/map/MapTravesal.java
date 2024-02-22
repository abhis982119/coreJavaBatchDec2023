package com.batchDec2023.coreJava.collection.traverse.foreachloop.map;

import java.util.HashMap;
import java.util.Map;

public class MapTravesal {

    public static void main(String[] args) {

        Map<String,String> cities = new HashMap<>();
        cities.put("India","Delhi");
        cities.put("China","Beijing");
        cities.put("USA", "Washington D.C");
        cities.put("India","New Delhi");  //update


        for(Map.Entry<String, String> entry : cities.entrySet()){
            System.out.println(entry);
        }

        System.out.println(" *********************************");
        System.out.println(" *********************************");

        for(String key : cities.keySet()){
            System.out.println(key);
        }


        System.out.println(" *********************************");
        System.out.println(" *********************************");

        for(String value : cities.values()){
            System.out.println(value);
        }
    }
}
