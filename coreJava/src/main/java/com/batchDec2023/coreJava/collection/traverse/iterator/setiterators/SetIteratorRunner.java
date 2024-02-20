package com.batchDec2023.coreJava.collection.traverse.iterator.setiterators;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteratorRunner {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));

        System.out.println(set);

       Iterator<Integer> itr =  set.iterator();
       while(itr.hasNext()){
           int value = itr.next();
           System.out.print(value + ", ");
       }
    }
}
