package com.batchDec2023.coreJava.collection.traverse.foreachloop;

import java.util.Arrays;
import java.util.List;

public class ListForEachLoopRunner {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        for(Integer value : list ){
            System.out.print(value + ", ");
        }
    }
}
