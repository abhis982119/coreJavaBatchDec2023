package com.batchDec2023.coreJava.collection.set.basic.linedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetBasicRunner {

    public static void main(String[] args) {
        Set set = new LinkedHashSet();
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
