package com.batchDec2023.coreJava.revision.cloning.deep;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder
public class Student implements  Cloneable {

    private int rollNumber;

    private String name;

    private School school;

    @Override
    protected Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }


    public Student deepClone() throws CloneNotSupportedException{
        Student clonedStudent = (Student) super.clone();
        School clonedSchool = School.builder().name(school.getName()).build();
        clonedStudent.setSchool(clonedSchool);
        return clonedStudent;
    }
}
