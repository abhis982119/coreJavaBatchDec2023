package com.batchDec2023.coreJava.collection.sort.listsorting.comparator;

import com.batchDec2023.coreJava.collection.sort.model.Employee;

import java.util.Comparator;

public class EmployeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        if(emp2.getEmpId() > emp1.getEmpId()){
            return -1;
        }else if(emp2.getEmpId() < emp1.getEmpId()){
            return 1;
        }else{
            return 0;
        }
    }
}
