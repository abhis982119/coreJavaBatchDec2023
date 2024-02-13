package com.batchDec2023.coreJava.multithreading.latches;

public class CourseCompletionJoinExample {

    public static void main(String[] args) throws InterruptedException {

        Thread createSyllabus = new Thread(() -> System.out.println("Syllabus created"));

        Thread teachSubject = new Thread(() -> System.out.println("Subject taught"));

        Thread takeExam = new Thread( () -> System.out.println("Take exam "));

        createSyllabus.start();
        createSyllabus.join();
        teachSubject.start();
        teachSubject.join();
        takeExam.start();

    }
}
