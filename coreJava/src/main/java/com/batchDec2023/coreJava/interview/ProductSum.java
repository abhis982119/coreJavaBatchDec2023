package com.batchDec2023.coreJava.interview;
/*

Input: N = 5, array[] = {1,2,3,4,5}
Output: 120 60 40 30 24



    [ 1    2  6 24 120]   : right

    [ 120 120 60 20 5 ]   : left


     [1    1   2  6  24  120 ]
     [120 120 60  20 5    1 ]
 */

public class ProductSum {

    public static void main(String[] args) {
       // int[] input =  {1,2,3,4,5};
        int[] input =  {1,1,2,1,1};

        int[] right = new int[input.length];
        int[] left = new int[input.length];

        right[0] = 1;
        left[input.length-1]= 1;

        for(int i =  1; i < input.length; i++){
            right[i] = right[i-1]*input[i-1];
        }

        for(int i = input.length-2 ; i >= 0 ; i--){
            left[i] = left[i+1] *input[i+1];
        }

         print(right) ;
         print(left) ;

         for(int i = 0;  i < input.length; i++){
             System.out.print( (right[i]*left[i]) + ", ");
         }

    }

    public static  void print(int[] arr){
        for(int value : arr){
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
