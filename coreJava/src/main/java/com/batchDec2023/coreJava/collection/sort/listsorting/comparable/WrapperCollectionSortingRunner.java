package com.batchDec2023.coreJava.collection.sort.listsorting.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WrapperCollectionSortingRunner {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,2,1,4);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
