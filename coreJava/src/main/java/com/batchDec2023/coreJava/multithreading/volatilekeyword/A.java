package com.batchDec2023.coreJava.multithreading.volatilekeyword;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class A {


     private volatile int a = 0;
}
