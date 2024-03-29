package com.batchDec2023.coreJava.collection.traverse.streams.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapStreamsExample {

    public static void main(String[] args) {

        Map<String,String> cities = new HashMap<>();
        cities.put("India","Delhi");
        cities.put("China","Beijing");
        cities.put("USA", "Washington D.C");
        cities.put("India","New Delhi");  //update


        for(Map.Entry<String, String> entry  :cities.entrySet()){
            System.out.println(entry);
        }

        cities.entrySet().forEach(System.out::println);

        cities.keySet().forEach(System.out::println);

        cities.values().forEach(System.out::println);


        cities.entrySet().stream().forEach(System.out::println);

        List<String> list = new ArrayList<>();

        

    }
}
