package com.batchDec2023.coreJava.office;

import com.batchDec2023.coreJava.classelements.staticblock.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        Student naresh  = Student.builder().name("Naresh").rollNumber(1).build();
        Student mahikshit = Student.builder().name("Mahikshit").rollNumber(2).build();

        List<Student> students = new ArrayList<>();
        students.add(naresh);
        students.add(mahikshit);


        List<Student> copyStudents = new ArrayList<>();
         for(Student student : students){
             copyStudents.add(student.clone());
         }
        System.out.println(students);


         List<Student> cStudent = students.stream().map(Student::clone).collect(Collectors.toList());


    }

    public static void update(List<Student> students){
        students.removeIf(student -> student.getName().equals("Naresh"));
    }
}
