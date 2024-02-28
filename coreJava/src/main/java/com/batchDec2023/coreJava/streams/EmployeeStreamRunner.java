package com.batchDec2023.coreJava.streams;

import com.batchDec2023.coreJava.streams.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamRunner {

    public static void main(String[] args) {
        Employee raghav = Employee.builder().empid(1).name("Raghav").city("Noida").salary(40000).department("IT").build();
        Employee sunita = Employee.builder().empid(2).name("Sunita").city("Delhi").salary(80000).department("HR").build();
        Employee sima = Employee.builder().empid(3).name("Sima").city("Pune").salary(150000).department("IT").build();
        Employee rohit = Employee.builder().empid(4).name("Rohit").city("Noida").salary(60000).department("Sales").build();
        Employee priya = Employee.builder().empid(5).name("Priya").city("Noida").salary(40000).department("Marketing").build();
        Employee ashish = Employee.builder().empid(6).name("Ashish").city("Noida").salary(140000).department("IT").build();
        Employee naresh = Employee.builder().empid(7).name("Naresh").city("Bangalore").salary(60000).department("IT").build();

        List<Employee> employees = Arrays.asList(raghav, sunita, sima, rohit, priya, ashish, naresh);

        List<Employee> noidaEmployees = employees.stream().filter(employee -> employee.getCity().equals("Noida")).collect(Collectors.toList());
        System.out.println("noida employee : " + noidaEmployees);

        List<String> noidaEmployeeNames = employees.stream().filter(employee -> employee.getCity().equals("Noida")).map(employee -> employee.getName()).collect(Collectors.toList());

        System.out.println("noida employee names : " + noidaEmployeeNames);


        List<Integer> noidaEmployeeIds = employees.stream().filter(employee -> employee.getCity().equals("Noida")).map(Employee::getEmpid).collect(Collectors.toList());
        System.out.println("noida employee ids : " + noidaEmployeeIds);


        int noidaEmployeeSalary = employees.stream().filter(employee -> employee.getCity().equals("Noida")).mapToInt(employee -> employee.getSalary()).sum();

        System.out.println("Noida emp salaries : " + noidaEmployeeSalary);

        int noidaITEmployeeSalary = employees.stream().filter(employee -> employee.getCity().equals("Noida") && employee.getDepartment().equals("IT"))
                .mapToInt(Employee::getSalary).sum();

        System.out.println("Noida IT dept salaries : " + noidaITEmployeeSalary);




        //Conversion to int
        Set<Employee> noidaEmployeesSet = employees.stream().filter(employee -> employee.getCity().equals("Noida")).collect(Collectors.toSet());
        System.out.println("noida employees set : " + noidaEmployeesSet);



        //Employee : name  :  salary > 50k , city : noida,  sorted in asc

        List<String> employeeWithSalaryGreaterThan50k = employees.stream().filter(employee ->  employee.getCity().equals("Noida"))
                .filter(employee -> employee.getSalary() > 50000).sorted(Comparator.comparingInt(Employee::getSalary))
                .map(Employee::getName).collect(Collectors.toList());

        System.out.println(" employee of noida with salary > 50k : " + employeeWithSalaryGreaterThan50k);



        Double averageNoidaEmployeeSalary = employees.stream().filter(employee -> employee.getCity().equals("Noida")).mapToInt(employee -> employee.getSalary()).average().getAsDouble();
        System.out.println("average salary of noida employee : " + averageNoidaEmployeeSalary);




        List<String> noidaEmployeeNamesWithParallelStream = employees.parallelStream().filter(employee -> employee.getCity().equals("Noida")).map(employee -> employee.getName()).collect(Collectors.toList());

        System.out.println("noida employee names : " + noidaEmployeeNamesWithParallelStream);


        //parallel stream output will differ the insertion order cause different thread working on differnt index
        employees.stream().forEach(employee -> System.out.println(employee.getEmpid()));
        employees.parallelStream().forEach(employee -> System.out.println(employee.getEmpid()));

        System.out.println("total employees in IT dept : " +  employees.stream().filter(employee -> employee.getDepartment().equals("IT")).count());

    }
}
