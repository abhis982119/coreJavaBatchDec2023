package com.batchDec2023.coreJava.collection.set.basic.hashset;

import com.batchDec2023.coreJava.collection.set.model.Student;

import java.util.HashSet;
import java.util.Set;

public class AddMethodWorkingRunner {


    public static void main(String[] args) throws Exception{
        Student sima = Student.builder().name("Sima").rollnumber(1).build();

        Set<Student> students =  new HashSet<>();
        students.add(sima);
        students.add(sima);

        System.out.println(students);
        Student clonedSima = sima.clone();

        clonedSima.setName("Sima-new");
        students.add(clonedSima);
        System.out.println( "post cloned " + students);
    }
}
