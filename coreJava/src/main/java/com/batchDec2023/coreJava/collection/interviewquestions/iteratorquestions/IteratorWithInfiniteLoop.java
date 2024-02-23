package com.batchDec2023.coreJava.collection.interviewquestions.iteratorquestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorWithInfiniteLoop {

    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Swati");
        studentNames.add("Sima");
        studentNames.add("Ashish");
        studentNames.add("Naresh");

        ListIterator<String> itr =  studentNames.listIterator();
        while(itr.hasNext()){
            itr.next();
            itr.add("Dummuy");
            System.out.println(studentNames);
        }

    }

}
