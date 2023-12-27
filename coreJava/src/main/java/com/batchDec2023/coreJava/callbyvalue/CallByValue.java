package com.batchDec2023.coreJava.callbyvalue;

public class CallByValue {

    int age = 10;
    public static void main(String[] args) {

/*        Student student = new Student();
        student.setAge(10);
        System.out.println(student);

        IntModifier intModifier = new IntModifier();
        intModifier.addTen(student);

        System.out.println("Student after 10 years " + student); */

    }


}
/*
STACK                                                            Heap
-----                             --------                     ---------
main                               addTen()                    1234567
-----                             ----------                   Student{age = 20}
Student student=1234567         student=1234567
-----                            ----------
addTen()
----                              ---------
 10                       <---
----                              --------
*/
