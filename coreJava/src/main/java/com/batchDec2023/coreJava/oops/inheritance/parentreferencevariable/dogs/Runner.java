package com.batchDec2023.coreJava.oops.inheritance.parentreferencevariable.dogs;

public class Runner {

    public static void main(String[] args) {
        Human human = new Human();
  /*      human.speak();
        human.write();
*/
        Dog dog = new Dog();
   /*     dog.speak();
        dog.wagTail();
*/
        Animal animal = new Human();
      //  animal.write();

        Human humanAnimal = (Human) animal;
        humanAnimal.speak();
    }


}
