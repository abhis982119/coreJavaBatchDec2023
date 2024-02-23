package com.batchDec2023.coreJava.collection.interviewquestions.iteratorquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {


    public static void main(String[] args) {


            List<String> studentNames = new ArrayList<>();
            studentNames.add("Swati");
            studentNames.add("Sima");
            studentNames.add("Ashish");
            studentNames.add("Naresh");
            System.out.println(studentNames);

            Iterator<String> itr = studentNames.iterator();
            while (itr.hasNext()) {

                if (itr.next().equals("Ashish")) {
                   // studentNames.add(studentName);  // ConcurrentModificationException
                    itr.remove();
                }
            }


        System.out.println(studentNames);

   /*     for(String value : studentNames){
            if(value.equals("Ashish"))    studentNames.add(value);
        }
        */


/*
        for(int i = 0; i < studentNames.size(); i++){
            String studentName = studentNames.get(i);
            if(studentName.equals("Ashish"))    studentNames.add(studentName);
        }
*/


        }
    }
