package com.batchDec2023.coreJava.accessmodifiers.publicmodifiers.classlevel;

public class Runner {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();
        publicClass.protectedMethod();
        publicClass.defaultMethod();
     /*  java: privateMethod() has private access
      publicClass.privateMethod();
      */
    }
}
