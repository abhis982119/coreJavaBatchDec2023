package com.batchDec2023.coreJava.stringmanipulation.stringclass;

/*
 == : compare memory reference for data in heap
 equals : Object : compares reference
                 : String class equals compares values
 */
public class StringConstantPool extends  Object{

    public static void main(String[] args) {

        String student1 = "Sima";
        String student2 = new String("Sima");
        String student3 = "Sima";

        String student4 = "SIma";

        System.out.println(student1 == student2); // false : reference comparision by ==
        System.out.println(student1.equals(student2)); // true  : value comparision
                                                                 // by overriden equal method of String class

        System.out.println(student1 == student3);  // true
        System.out.println(student1.equals(student3)); // true


        System.out.println(student1 == student4); // false
        System.out.println(student1.equals(student4)); //  false


    }

}
