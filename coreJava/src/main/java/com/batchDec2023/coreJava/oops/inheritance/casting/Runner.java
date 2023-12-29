package com.batchDec2023.coreJava.oops.inheritance.casting;

import com.batchDec2023.coreJava.oops.inheritance.preventinheritance.A;

public class Runner {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        if(dog instanceof  Animal){
            System.out.println("True, Dog instance of animal");
        }

        if(animal instanceof  Dog){
            System.out.println("True Animal instance of animal");
        }else{
            System.out.println("False Animal instance of animal");
        }


        Animal upcastedDog = (Animal)dog;

        if(upcastedDog instanceof  Dog){
            System.out.println("True upcastedDog instance of dog");
        }else{
            System.out.println("False upcastedDog instance of dog");
        }




    }
}





/*
  isA                                            hasA


  Dog is a Animal
                                            public class Engine{}
                                             public class Car{
                                              private Engine engine;
                                             }

                                             Car has a engine

  public class Animal{}

  public class Dog extends Animal{}

  Dog is a animal


 */







