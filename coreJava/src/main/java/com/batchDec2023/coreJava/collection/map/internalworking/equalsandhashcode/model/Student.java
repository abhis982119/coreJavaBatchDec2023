package com.batchDec2023.coreJava.collection.map.internalworking.equalsandhashcode.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Setter
@Getter
@ToString
@Builder
public class Student {

    private String name;

    private int rollNumber;

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals called ");
        if (this == o) {  // reference check
            return true;
        }
        if (o == null || getClass() != o.getClass() ) { // if object is not null & of
            return false;
        }

        return rollNumber == ((Student) o).getRollNumber();

    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode called ");
        return rollNumber;
    }
}
