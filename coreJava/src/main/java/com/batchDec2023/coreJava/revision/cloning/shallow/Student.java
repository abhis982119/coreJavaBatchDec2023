package com.batchDec2023.coreJava.revision.cloning.shallow;

import lombok.Builder;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Builder
public class Student implements Cloneable {

    private int rollNumber;

    private String name;


    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
