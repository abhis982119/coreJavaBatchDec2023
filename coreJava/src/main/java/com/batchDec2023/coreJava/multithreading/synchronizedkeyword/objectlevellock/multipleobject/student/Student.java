package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.objectlevellock.multipleobject.student;

import lombok.Builder;
import lombok.Getter;
import lombok.SneakyThrows;

@Getter
@Builder
public class Student {

    private int rollNumber;

    private String name;

    @SneakyThrows
    public synchronized void takeClass(String subject){
        System.out.println(name + " started aking class " + subject);
        Thread.sleep(10000);
        System.out.println(name + " ended taking class " + subject);

    }

    @SneakyThrows
    public synchronized void takeNotes(String subject){
        System.out.println(name + " started  taking class notes  " + subject);
        Thread.sleep(3000);
        System.out.println(name + " ended taking class notes  " + subject);
    }

}
