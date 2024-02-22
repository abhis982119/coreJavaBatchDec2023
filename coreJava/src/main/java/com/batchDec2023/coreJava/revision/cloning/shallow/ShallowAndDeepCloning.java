package com.batchDec2023.coreJava.revision.cloning.shallow;


public class ShallowAndDeepCloning extends  Object{

    public static void main(String[] args) throws CloneNotSupportedException {
        Student sima = Student.builder().name("Sima").rollNumber(1).build();
        System.out.println(sima);

        Student simaCloned = sima.clone();

        if(sima != simaCloned){
            System.out.println("Both objects are not same ");
        }
    }
}
