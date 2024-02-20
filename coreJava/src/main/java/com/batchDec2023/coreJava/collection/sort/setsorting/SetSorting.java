package com.batchDec2023.coreJava.collection.sort.setsorting;

import com.batchDec2023.coreJava.collection.sort.model.Student;

import java.util.*;

public class SetSorting {

    public static void main(String[] args) {
        Student rajesh = Student.builder().rollNumber(1).name("Rajesh").build();
        Student swati = Student.builder().rollNumber(3).name("Swati").build();
        Student sima = Student.builder().rollNumber(2).name("Sima").build();


        List<Student> students = Arrays.asList(rajesh, swati, sima );

        Set<Student> setStudents = new HashSet<>(students);




        Set<Integer> intSet = new HashSet<>(Arrays.asList(3,2,1));
        List<Integer> intList = new ArrayList<>(intSet);
        Collections.sort(intList);
        System.out.println(intList);


    }
}
