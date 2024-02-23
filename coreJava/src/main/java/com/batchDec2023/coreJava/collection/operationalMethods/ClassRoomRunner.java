package com.batchDec2023.coreJava.collection.operationalMethods;

import java.util.*;

public class ClassRoomRunner {

    public static void main(String[] args) {
        Proctor proctor =   Proctor.builder().proctorId(1).build();
        Student student = Student.builder().rollNumber(1001).build();

        ClassRoom classRoom = new ClassRoom();
        classRoom.addStudentToProctor(proctor, student);
        classRoom.addStudentToProctor(proctor, student);

        System.out.println(classRoom);


        ClassRoom.print(Arrays.asList(1,2,3,4,5));
   //     ClassRoom.print(new HashSet(Arrays.asList(1,2,3,4,5)));


    }
}
