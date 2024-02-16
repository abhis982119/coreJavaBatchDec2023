package com.batchDec2023.coreJava.collection.reflectionpackage;

import com.batchDec2023.coreJava.office.Student;

import java.lang.reflect.Field;
import java.util.*;
import java.lang.reflect.Field;

class Test {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> al = new ArrayList<Integer>(5);
        for (int i = 0; i < 10; i++) {
            al.add(i);
            System.out.println("size=" + al.size() + " capacity=" + getcapacity(al));
        }
    }

    static int getcapacity(ArrayList l) throws Exception {
        Field f = ArrayList.class.getDeclaredField("elementData");
        f.setAccessible(true);
        return ((Object[]) f.get(l)).length;
    }
}
