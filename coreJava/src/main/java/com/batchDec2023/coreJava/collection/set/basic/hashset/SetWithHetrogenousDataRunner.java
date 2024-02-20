package com.batchDec2023.coreJava.collection.set.basic.hashset;

import java.util.HashSet;
import java.util.Set;

public class SetWithHetrogenousDataRunner {

    public static void main(String[] args) {

        Set set = new HashSet();
        set.add(1);
        set.add("Sima"); // heterogenous data allowed
        set.add(null); // null insertion
        set.add(2);
        set.add(1);

        System.out.println("Is element does not  exist : " + set.add(9));
        System.out.println("Is element does not exist : " + set.add(9));
        System.out.println(set);   // insertion order is not preserved
    }
}
