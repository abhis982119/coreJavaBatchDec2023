package com.batchDec2023.coreJava.collection.traverse.streams;

import java.util.Arrays;
import java.util.List;

public class ListStreamExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.stream().forEach(value -> {
            System.out.print(value + ", ");
        });

        System.out.println();
        list.stream().forEach(value -> System.out.print(value + ", "));

    }
}
