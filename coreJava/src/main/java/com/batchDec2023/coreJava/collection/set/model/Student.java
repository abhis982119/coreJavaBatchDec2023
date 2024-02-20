package com.batchDec2023.coreJava.collection.set.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@ToString
@Getter
@Setter
@Builder
public class Student implements  Cloneable{

     private String name;

     private int rollnumber;


    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

 /*   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return student.rollnumber == ((Student) o).rollnumber;
    }

    @Override
    public int hashCode() {
        return rollnumber;
    }*/
}
