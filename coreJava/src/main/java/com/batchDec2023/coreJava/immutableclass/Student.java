package com.batchDec2023.coreJava.immutableclass;

import lombok.AllArgsConstructor;

import java.util.*;


public final class Student implements Cloneable {
    Collection
    private final  String rollNumber;

    private MyClass myClass = new MyClass();

    public Student(String rollNumber) {
        this.rollNumber = rollNumber;
    }
/*
    public void printResult(double percentage){
        rollNumber = String.valueOf(percentage); // final rollNumber value cannot be reassign
    }
*/

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
