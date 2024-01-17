package com.batchDec2023.coreJava.immutableclass;

import lombok.Setter;
import lombok.ToString;


@Setter
//public class MyStudent extends Student{
public class MyStudent {

    private String rollNumber;



    public MyStudent(String rollNumber) {
     //   super(rollNumber);
        this.rollNumber = rollNumber;
    }
}
