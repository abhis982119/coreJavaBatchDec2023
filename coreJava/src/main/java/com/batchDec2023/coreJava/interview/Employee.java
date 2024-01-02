package com.batchDec2023.coreJava.interview;

/*
Get the Noida city employees from EmployeeList and sort the Noida city employees in the reverse alphabetically order by name of the employee using Java 8

        Employee{
        id,
        name,
        city;
        }*/

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Employee {
    private int id;
   private String name;
    private String city;
}
