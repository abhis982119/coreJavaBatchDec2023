package com.batchDec2023.coreJava.collection.traverse.iterator.listiterators;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
    i
   [1 2 3 4 5]
 */
public class ListExampleIteratorRunner {


    public static void main(String[] args) {

        List<Integer> list =  Arrays.asList(1, 2, 3, 4, 5);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }

    }
}
