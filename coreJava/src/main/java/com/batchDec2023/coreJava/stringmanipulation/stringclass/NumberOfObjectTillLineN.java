package com.batchDec2023.coreJava.stringmanipulation.stringclass;

public class NumberOfObjectTillLineN {

    public static void main(String[] args) {
        String s1 = "sima";    // 1  | +1
        String s2 = "sima";    // 1

        String s3 = new String("sima"); // 2 | +1
        String s4 = new String("sima"); //3  | +1

        s3.concat(s4); // 4 | +1

        String s5 = new String("sema"); // 5 | +1
        s1.replace('e', 'i');  // 6 | +1

        //total object : 6



        Integer a = 5;
        System.out.println("original value " + a); // 5
        updateInt(a);
        System.out.println("updated value " + a); // 10

    }

    public static void updateInt(Integer b){
        System.out.println("a received " + b); // 5
        b = 10;
        System.out.println("a updated to  " + b); // 10
    }
}


/*
stack
--------      --------------            ---------
main             updateInt                 Heap
---------     ---------------           ---------
a =   123       b = 456                    123
                                           Integer{5}

                                           456
                                           Integer{10}
-------       ---------------



 */