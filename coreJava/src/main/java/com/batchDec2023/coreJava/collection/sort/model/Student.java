package com.batchDec2023.coreJava.collection.sort.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Builder
public class Student implements Comparable<Student> {

    private int rollNumber;

    private String name;

    @Override
    public int compareTo(Student anotherStudent) {
        if(rollNumber > anotherStudent.rollNumber ){
            return 1;
        }else if( rollNumber < anotherStudent.rollNumber){
            return -1;
        }else{
            return 0;
        }
    }
}
