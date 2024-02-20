package com.batchDec2023.coreJava.collection.list.basic;

import com.batchDec2023.coreJava.multithreading.atomicpackage.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BasicOperationsRunner {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.print("[");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] +  ( i == arr.length-1 ? "" : ", " ) );
        }
        System.out.print("]");
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        //list.remove(-1);   // java.lang.ArrayIndexOutOfBoundsException: -1



        System.out.println(list);

    }
}
