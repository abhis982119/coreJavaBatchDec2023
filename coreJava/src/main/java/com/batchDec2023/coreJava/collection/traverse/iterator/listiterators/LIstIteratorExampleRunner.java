package com.batchDec2023.coreJava.collection.traverse.iterator.listiterators;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class LIstIteratorExampleRunner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        ListIterator<Integer>  itr = list.listIterator();

        while(itr.hasNext()){
            Integer val = itr.next();
            System.out.print(val+ ", ");
        }

        System.out.println();
        System.out.println(list);


    }
}
