package com.batchDec2023.coreJava.callbyvalue;

public class IntModifier {


    public  int addTen(Integer value ){
        value +=  10;
        System.out.println("New value with added ten : " + value );
        return value;
    }

    public void addTen(Student student){
        student.setAge(student.getAge()+10);
        System.out.println("AgeModifier.addTen() : " + student);
    }
}
