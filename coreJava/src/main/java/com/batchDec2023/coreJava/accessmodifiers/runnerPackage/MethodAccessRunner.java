package com.batchDec2023.coreJava.accessmodifiers.runnerPackage;

import com.batchDec2023.coreJava.accessmodifiers.publicmodifiers.classlevel.PublicClass;

public class MethodAccessRunner  extends  PublicClass{

    public static void main(String[] args) {

        /* PUBIC METHOD */
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();


        /* PROCTECTED METHOD */
     /*  protectedMethod() has protected access
      publicClass.protectedMethod();*/


        /* DEFAULT METHOD */
/*      //cannot be accessed from outside package
        publicClass.defaultMethod();*/

        /* PRIVATE METHOD */
     /*
     java: privateMethod() has private access
      publicClass.privateMethod();
*/

        ChildClass childClass = new ChildClass();
        childClass.protectedMethod();


        MethodAccessRunner methodAccessRunner = new MethodAccessRunner();
        methodAccessRunner.protectedMethod();
    }
}
