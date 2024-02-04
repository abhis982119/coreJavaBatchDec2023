package com.batchDec2023.coreJava.coding;

public class InfiniteForLoop {


    public static void main(String[] args) {
        char[] arr = new char[]{'a','b','c'};
        for(int i = 0; i < 51 ; i++ ){
            System.out.print(arr[i%arr.length]);
        }
    }
}
