package com.batchDec2023.coreJava.generics;

import lombok.ToString;

import java.util.Collection;

@ToString
public class MyList<E> {

    E value;

    public void setValue( E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

}
