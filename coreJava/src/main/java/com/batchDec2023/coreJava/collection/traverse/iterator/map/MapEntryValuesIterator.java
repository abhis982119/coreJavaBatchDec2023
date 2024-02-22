package com.batchDec2023.coreJava.collection.traverse.iterator.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEntryValuesIterator {

    public static void main(String[] args) {


        Map<String,String> cities = new HashMap<>();
        cities.put("India","Delhi");
        cities.put("China","Beijing");
        cities.put("USA", "Washington D.C");
        cities.put("India","New Delhi");  //update


        Iterator<Map.Entry<String, String>> entryIterator = cities.entrySet().iterator();

        while (entryIterator.hasNext()){
            System.out.println(entryIterator.next());
        }


        Iterator<String> keyIterator = cities.keySet().iterator();
        while(keyIterator.hasNext()){
            System.out.println(keyIterator.next());
        }


        Iterator<String>  valueIterator = cities.values().iterator();
        while(valueIterator.hasNext()){
            System.out.println(valueIterator.next());
        }

    }
}
