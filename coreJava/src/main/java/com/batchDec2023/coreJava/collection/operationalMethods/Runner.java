package com.batchDec2023.coreJava.collection.operationalMethods;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {


        List<String> studentNames = new ArrayList<>();
        studentNames.add("Swati");
        studentNames.add("Sima");
        studentNames.add("Ashish");
        studentNames.add("Naresh");

        System.out.println(studentNames);
        studentNames.removeIf(name -> name.equals("Ashish") );
        System.out.println(studentNames);
    }
}
