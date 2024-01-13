package com.batchDec2023.coreJava.stringmanipulation.stringbuffer;

public class SBEqualsAndCompare {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("sima");
        StringBuffer sb2 = new StringBuffer("sima");

        String s1 = "sima";
        String s2 =  new String("sima");

        System.out.println("***************");
        System.out.println(sb1 == sb2); // false
        System.out.println(sb1.equals(sb2)); // false


        System.out.println(s1.equals(sb1)); // false
        System.out.println(sb1.equals(s1)); // false

        System.out.println(s2.equals(sb1)); //false
        System.out.println(sb1.equals(s2)); //false


    }
}
