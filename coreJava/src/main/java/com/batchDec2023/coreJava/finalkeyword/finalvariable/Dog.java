package com.batchDec2023.coreJava.finalkeyword.finalvariable;


import lombok.ToString;

@ToString
public class Dog {

    private  final static int  maxAge = 20;
    private final String breed;

    private final String color;

    public Dog(String breed, String color) {
        this.breed = breed;
        this.color = color;
    }

    private String name;


    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }


    public String getName() {
        return name;
    }


}
