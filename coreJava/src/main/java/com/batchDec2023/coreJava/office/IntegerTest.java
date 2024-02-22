package com.batchDec2023.coreJava.office;

public class IntegerTest {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");
        String s4 = "abc";


        Integer a = Integer.valueOf(128);   // -128 to 127 : cached
        Integer b = Integer.valueOf(128);

        Float c = Float.valueOf(10);
        Float d = Float.valueOf(10);

        if(a == b) System.out.println("int same");        // p
        if(c == d) System.out.println("float same");      // -

        if(s1 == s2) System.out.println("s1 & s2 same");  // -
        if(s1 == s3) System.out.println("s1 & s3 same");  // -
        if(s1 == s4) System.out.println("s1 & s4 same");  // p

    }
}
