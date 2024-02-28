package com.batchDec2023.coreJava.streams;

import java.util.Arrays;
import java.util.List;

public class BasicTraversal {

    public static void main(String[] args) {
        List<Integer>  prices = Arrays.asList(1,2,3,4,5);

        prices.stream().forEach(value -> System.out.println(value));
        prices.stream().forEach( System.out::println);

        int totalSum = prices.stream().mapToInt(value -> value).sum();
        System.out.println("total sum : " + totalSum);

        int specialzedSum = prices.stream().filter(value -> value > 3).mapToInt(x-> x).sum();
        System.out.println("total sum : " + specialzedSum);

        int sum = 0;
        for(Integer value : prices){
            if(value > 3 ) { // filter
                sum += sum;
            }
        }
        System.out.println(sum);
    }
}
