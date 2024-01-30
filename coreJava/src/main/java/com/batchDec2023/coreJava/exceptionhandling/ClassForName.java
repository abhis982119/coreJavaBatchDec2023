package com.batchDec2023.coreJava.exceptionhandling;

import com.batchDec2023.coreJava.exceptionhandling.userdefinedexceptions.DynamicLoadingClass;

public class ClassForName {

    public static void main(String[] args) {
        DynamicLoadingClass dynamicLoadingClass = new DynamicLoadingClass();
        System.out.println(dynamicLoadingClass.getA());

        try {
            //java.lang.ClassNotFoundException // It occures only when we try load a class dynamically
            Class<?> dynamicallyLoadedNonExistingClass =   Class.forName("com.batchDec2023.coreJava.exceptionhandling.userdefinedexceptions.KBC");

            //Below will work fine and object will be created
             Class<?> dynamicallyLoadedObject =   Class.forName("com.batchDec2023.coreJava.exceptionhandling.userdefinedexceptions.DynamicLoadingClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Exception arsied : " + e.getMessage());
            e.printStackTrace();
        }

    }
}
