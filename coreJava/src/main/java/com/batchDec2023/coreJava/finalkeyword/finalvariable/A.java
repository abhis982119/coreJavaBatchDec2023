package com.batchDec2023.coreJava.finalkeyword.finalvariable;


import lombok.Getter;
import lombok.Setter;



public class A {

    private final int age = 10;

    public int getAge() {
        return age;
    }

/*
  cannot assign a value to final variable age

   public void setAge(int age){
        this.age = age;
    }*/
}
