package com.batchDec2023.coreJava.streams.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@Builder
public class Employee {

    private int  empid;
    private String name;
    private String city;
    private String department;
    private int salary;
}
