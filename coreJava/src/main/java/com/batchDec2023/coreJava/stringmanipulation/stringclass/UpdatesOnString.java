package com.batchDec2023.coreJava.stringmanipulation.stringclass;

public class UpdatesOnString {


    public static void main(String[] args) {
        String s1 = "sima";
        String s2 = "sima";

        System.out.println(s1 == s2);     // true
        System.out.println(s1.equals(s2));// true

        System.out.println(s1.concat(" mote")); //sima mote

        System.out.println(s1 == s2);   // true
        System.out.println(s1.equals(s2)); // true


        String s3 = new String("sima");
        String s4 = s3;

        System.out.println(s3 == s4);  //true
        System.out.println(s3.equals(s4)); //true


        s3.concat(" mote");

        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true

    }

}
