package com.batchDec2023.coreJava.interview;

import com.batchDec2023.coreJava.oops.inheritance.parentreferencevariable.abc.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(Employee.builder().name("Ramesh").id(1).city("GOA").build());
        employees.add(Employee.builder().name("Suresh").id(2).city("DELHI").build());
        employees.add(Employee.builder().name("Rajesh").id(3).city("NOIDA").build());
        employees.add(Employee.builder().name("Kamlesh").id(4).city("NOIDA").build());


        employees.removeIf(employee -> employee.getCity() != "NOIDA");

        System.out.println(employees);

        List<String> employeeNames = employees.stream().map(Employee::getName).collect(Collectors.toList());

        System.out.println(employeeNames);
    }
}
