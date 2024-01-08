package com.batchDec2023.coreJava.accessmodifiers.privatemodifier;

public class PrivateMethodClass {

    private String privateVariable = "privateVariable";

    public String publicVariable = "publicVariable";

    private  void privateMethod(){
        System.out.println("private method");
    }

    public void publicMethod(){
        System.out.println("public method");
    }
}
