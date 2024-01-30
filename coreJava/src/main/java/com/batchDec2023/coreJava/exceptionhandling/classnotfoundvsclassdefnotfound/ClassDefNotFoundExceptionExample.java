package com.batchDec2023.coreJava.exceptionhandling.classnotfoundvsclassdefnotfound;

public class ClassDefNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("First-line");
        System.out.println("Second-line");
        /*

         */
        ClassToBeDeleted classToBeDeleted = new ClassToBeDeleted();
        System.out.println("End of code");
    }
}
