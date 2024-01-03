package com.batchDec2023.coreJava.oops.polymorphism.overriding.visibilitycannotbereduced;

/*
   public > protected > default > private

   Access privalege can only be increased or maintained by overriding methods
 */
public class B extends A{
    //  attempting to assign weaker access privileges; was public
 /*    private void m1(){
        System.out.println("B-m1()");
    }
*/

    public void m2(){
        System.out.println("B-m2()");
    }

}
