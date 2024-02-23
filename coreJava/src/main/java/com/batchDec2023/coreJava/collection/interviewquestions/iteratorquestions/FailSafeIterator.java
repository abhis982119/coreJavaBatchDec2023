package com.batchDec2023.coreJava.collection.interviewquestions.iteratorquestions;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> studentNames = new CopyOnWriteArrayList<String>();
        studentNames.add("Ashish");
        studentNames.add("Sima");
        studentNames.add("Swati");


        Iterator<String> itr = studentNames.iterator();
        while(itr.hasNext()){
            String studentName = itr.next();
            if(studentName.equals("Ashish")) {

            }
            else System.out.print(studentName + ", ");
        }
        System.out.println();

    }
}
