package com.batchDec2023.coreJava.accessmodifiers.publicmodifiers.classlevel;


/*
   public > protected > default > private

   public : access from any package
   protected : access from same package or from child class from another package
   default : only within the package
   private : only within the class

 */
public class PublicClass {

    public int publicVar = 10;
      int defaultVar = 10;

    public void publicMethod(){
        System.out.println("public method executed");
    }

      void defaultMethod(){
        System.out.println("default method executed");
    }

    private void privateMethod(){
        System.out.println("private method executed");
    }

    protected  void protectedMethod(){
        System.out.println("Public class - proctected method executed");
    }

}
