package com.batchDec2023.coreJava.classelements.constructor;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Dog {

    private String color;
    private String breed;


    public Dog(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
}
