package com.batchDec2023.coreJava.classelements.constructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Student extends  Object{


    private int rollNo;

    private String firstName;

    private String lastName;

    private int standard;


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", standard=" + standard +
                '}';
    }


}
