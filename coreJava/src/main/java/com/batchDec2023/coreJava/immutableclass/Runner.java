package com.batchDec2023.coreJava.immutableclass;

import java.util.concurrent.CountDownLatch;

public class Runner {

    public static void main(String[] args) throws Exception{
        Student student = new Student("1303213004");
        System.out.println(student);


        MyStudent myStudent = new MyStudent("Sima123");
        System.out.println(myStudent);
        myStudent.setRollNumber("Sima456");


        print(student);

        //cloning
        Student cloned = (Student) student.clone();
        System.out.println("cloned student : " + cloned);
        System.out.println("student " + student);
      /*  print(myStudent);*/





    }

    private static void print(Student student){
        System.out.println(" ***** API CLASSES ***** ");
        System.out.println(student);
        System.out.println(" ***** API CLASSES ***** ");
    }
}
