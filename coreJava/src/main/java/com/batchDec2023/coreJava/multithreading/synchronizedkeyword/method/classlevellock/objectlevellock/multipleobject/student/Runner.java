package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.method.classlevellock.objectlevellock.multipleobject.student;

import lombok.SneakyThrows;

import java.util.concurrent.CompletableFuture;

public class Runner {

    @SneakyThrows
    public static void main(String[] args) {
        Student suresh =   Student.builder().name("Suresh").rollNumber(11).build();
        Student ramesh =   Student.builder().name("Ramesh").rollNumber(31).build();

        CompletableFuture.runAsync( () -> suresh.takeClass("english"));
        CompletableFuture.runAsync(() -> suresh.takeClass("maths"));

        CompletableFuture.runAsync(() -> ramesh.takeClass("Economics")) ;

        Thread.sleep(12000);

    }
}
