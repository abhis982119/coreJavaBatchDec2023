package com.batchDec2023.coreJava.collection.sort.listsorting.comparable;

import com.batchDec2023.coreJava.collection.sort.model.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserDefinedListDataSortingRunner {

    public static void main(String[] args) {
        Student rajesh = Student.builder().rollNumber(1).name("Rajesh").build();
        Student swati = Student.builder().rollNumber(3).name("Swati").build();
        Student sima = Student.builder().rollNumber(2).name("Sima").build();


        List<Student> students = Arrays.asList(rajesh, swati, sima );

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
}
