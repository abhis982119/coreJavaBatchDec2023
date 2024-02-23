package com.batchDec2023.coreJava.collection.operationalMethods;

import lombok.ToString;

import java.util.*;

@ToString
public class ClassRoom  {

    private Map<Proctor, Collection<Student>> studentProctormap = new HashMap<>();


    public void addStudentToProctor(Proctor proctor, Student student){

        Collection<Student> proctorStudentList = studentProctormap.get(proctor);
        if(proctorStudentList == null ) {
            proctorStudentList = new HashSet<>();
        }
        proctorStudentList.add(student);

        studentProctormap.put(proctor, proctorStudentList);
    }


    public static void print(List  list){
        for(Object o : list){
            System.out.println(o);
        }
    }

}
