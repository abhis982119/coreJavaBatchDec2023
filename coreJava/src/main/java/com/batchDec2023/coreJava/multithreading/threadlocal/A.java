package com.batchDec2023.coreJava.multithreading.threadlocal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class A {

    private  ThreadLocal<String>   name  = new ThreadLocal<>();


    private String rollNo;

}
