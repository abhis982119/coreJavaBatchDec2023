package com.batchDec2023.coreJava.collection.map.internalworking.equalsandhashcode.runner;

import com.batchDec2023.coreJava.collection.map.internalworking.equalsandhashcode.model.Proctor;
import com.batchDec2023.coreJava.collection.map.internalworking.equalsandhashcode.model.Student;

import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Student sima = Student.builder().name("Sima").rollNumber(1).build();

        Student duplicateSima = Student.builder().name("Sima").rollNumber(1).build();

        Map<Student, Integer>   students = new HashMap<>();

        System.out.println("-----------------**1st****----------------------------------");
        System.out.println("---------------------------------------------------");
        students.put(sima, sima.getRollNumber());
        System.out.println("----------------****1st****-----------------------------------");
        System.out.println("---------------------------------------------------");

        System.out.println("-----------------**2nd****----------------------------------");
        System.out.println("---------------------------------------------------");
        students.put(sima, sima.getRollNumber());  //equal() method of object class is used.

        System.out.println("-----------------**2nd****----------------------------------");
        System.out.println("---------------------------------------------------");


        System.out.println("-----------------**3nd****---------------------------");
        System.out.println("---------------------------------------------------");

        students.put(duplicateSima, duplicateSima.getRollNumber());

        System.out.println("-----------------**3nd****---------------------------");
        System.out.println("---------------------------------------------------");


        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        students.get(duplicateSima);

        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");




        System.out.println(students);
    }
}
