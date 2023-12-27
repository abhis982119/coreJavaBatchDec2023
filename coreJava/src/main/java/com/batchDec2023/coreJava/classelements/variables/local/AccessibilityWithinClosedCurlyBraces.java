package com.batchDec2023.coreJava.classelements.variables.local;

public class AccessibilityWithinClosedCurlyBraces {


    public static void main(String[] args){
        int a = 10;
        System.out.println(a);

        int i = 0;
        while(i < 10){
            int k =0;
            i++;
            k--;
        }
     //   System.out.println(k);   // NullPointer
    }
}
