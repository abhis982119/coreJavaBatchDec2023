package com.batchDec2023.coreJava.collection.traverse.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class SetStreamRunner {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));

        System.out.println(set);

        set.stream().forEach( value -> System.out.print(value + ", "));


        set.forEach(value -> System.out.print(value + ", "));

        CompletableFuture.runAsync(() -> System.out.println("Sima"));
    }
}
