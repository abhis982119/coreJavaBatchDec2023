package com.batchDec2023.coreJava.exceptionhandling.throwvsthrows;

import com.batchDec2023.coreJava.exceptionhandling.throwvsthrows.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Human {

  private Gender gender;

  private String name;

  private int age;
}

