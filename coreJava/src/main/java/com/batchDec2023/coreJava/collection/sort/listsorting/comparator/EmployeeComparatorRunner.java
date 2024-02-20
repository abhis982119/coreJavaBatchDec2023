package com.batchDec2023.coreJava.collection.sort.listsorting.comparator;

import com.batchDec2023.coreJava.collection.sort.model.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorRunner {

    public static void main(String[] args) {
        Employee rajesh = Employee.builder().empId(1).name("Rajesh").build();
        Employee sima = Employee.builder().empId(2).name("Sima").build();
        Employee swati = Employee.builder().empId(3).name("Swati").build();


        List<Employee>  employees = Arrays.asList(swati,rajesh,sima);
        System.out.println(employees);

       // Collections.sort(employees, new EmployeIdComparator());
    /*    Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                return emp1.getEmpId() > emp2.getEmpId() ? 1 : -1;
            }
        });*/


        Collections.sort(employees, (emp1, emp2) ->  emp1.getEmpId() > emp2.getEmpId() ? 1 : -1);
        System.out.println(employees);
        Collections.sort(employees, (emp1, emp2) ->  emp1.getName().compareTo(emp2.getName()));

        //       Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println(employees);
    }
}
