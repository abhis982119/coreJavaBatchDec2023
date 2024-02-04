package com.batchDec2023.coreJava.coding;

import java.util.Stack;

public class Asteroids {

    public static void main(String[] args) {
       // int[] asteroids = new int[]{5,10,-5};
        int[] asteroids = new int[]{8,-8};

        Stack<Integer> stack = new Stack();

        for(int i = 0; i < asteroids.length; i++){
            if(stack.empty()){
                stack.push(asteroids[i]);
                continue;
            }
            if( asteroids[i] < 0){  // if current asteroid moving backward
                 if(stack.peek() > 0){  // if prev asteroid moving forward
                      if(stack.peek() > Math.abs(asteroids[i])){
                          continue;
                      }else if(stack.peek() < Math.abs(asteroids[i])){
                          stack.pop();
                          stack.push(asteroids[i]);
                     }else{
                          stack.pop();
                      }
                 }
            }else{
                stack.push(asteroids[i]);
            }


        }

        int[] result = new int[stack.size()];
        for( int i = stack.size()-1; i >=0 ; i--){
            result[i] = stack.pop();
        }

        System.out.println(stack);
    }
}
