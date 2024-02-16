package com.batchDec2023.coreJava.collection.traverse.forloop;

import java.util.Arrays;
import java.util.List;

public class ListRunner {

    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(1, 2,3,4,5);


        for(int i = 0;  i < list.size(); i++){
            System.out.print(list.get(i ) + ", ");
        }
    }
}
