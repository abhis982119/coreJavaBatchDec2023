package com.batchDec2023.coreJava.accessmodifiers.runnerPackage;


import com.batchDec2023.coreJava.accessmodifiers.publicmodifiers.classlevel.PublicClass;
;
public class PublicClassAccessRunner {


    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.publicMethod();

/*
Cannot be access outside the pacakge : Default class
        DefaultClass defaultClass = new DefaultClass();
      */



    }
}
