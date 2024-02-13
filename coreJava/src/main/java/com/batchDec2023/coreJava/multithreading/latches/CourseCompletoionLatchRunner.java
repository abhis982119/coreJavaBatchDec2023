package com.batchDec2023.coreJava.multithreading.latches;

import java.util.concurrent.CountDownLatch;

public class CourseCompletoionLatchRunner {

    public   void main(String[] args) throws InterruptedException {
        CountDownLatch syllabusCreatedLatch = new CountDownLatch(1);
        CountDownLatch teachingCompleteLatch = new CountDownLatch(1);

        Runnable syllabusCreatedTask = () ->  {
             System.out.println("Syllabus created");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            syllabusCreatedLatch.countDown();
        };

        Thread createSyllabus = new Thread(syllabusCreatedTask);

        Thread teachSubject = new Thread(
                () -> {
                    System.out.println("Subject taught");
                    teachingCompleteLatch.countDown();
        });

        Thread takeExam = new Thread( () -> System.out.println("Take exam "));



        createSyllabus.start();
        syllabusCreatedLatch.await();


        teachSubject.start();
        teachingCompleteLatch.await();



        takeExam.start();


    }
}
