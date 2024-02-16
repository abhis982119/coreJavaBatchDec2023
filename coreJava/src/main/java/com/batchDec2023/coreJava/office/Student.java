package com.batchDec2023.coreJava.office;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    private String name;

    private int rollNumber;

    public Student clone(){
        return Student.builder().name(name).rollNumber(rollNumber).build();
    }

}
