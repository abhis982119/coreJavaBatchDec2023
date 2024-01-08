package com.batchDec2023.coreJava.finalkeyword.finalvariable;

public class Runner {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getAge());
        //   a.setAge(20);  final variable value cannot be updated once initialized
        System.out.println(a.getAge());


        Dog leo = new Dog("Huksy", "Grey");
        Dog goldy = new Dog("Labrador", "Golden");




        System.out.println(leo);
        System.out.println(goldy);

      //  System.out.println(Dog.maxAge); // private static variable cannot be accessed outside the class
    }

}
