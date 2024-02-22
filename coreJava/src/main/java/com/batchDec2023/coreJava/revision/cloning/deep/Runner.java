package com.batchDec2023.coreJava.revision.cloning.deep;

public class Runner {

    public static void main(String[] args)  throws CloneNotSupportedException{
        School DPS = School.builder().name("DPS").build();

        Student sima =  Student.builder().name("Sima").rollNumber(1).school(DPS).build();

       // Student clonedSima = sima.clone();  // shallow-cloning
        Student clonedSima = sima.deepClone();  // deep-cloning


        if(sima != clonedSima){
            System.out.println("Sima and clonedSima not same object");
        }

        if(sima.getSchool() != clonedSima.getSchool()){
            System.out.println("both sima and cloned sima school same");
        }
    }
}
/*  Pax                  Fares                  if (ageMatch) -> selectFare,   else match(type)
  - Sima (C-17)             Adult(17-60)
   Swati (A-41)            Child(5-16)
   Ashish (A-45)           Infant(0-4)


 */