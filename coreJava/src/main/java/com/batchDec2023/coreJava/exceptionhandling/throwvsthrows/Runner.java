package com.batchDec2023.coreJava.exceptionhandling.throwvsthrows;

import com.batchDec2023.coreJava.exceptionhandling.throwvsthrows.constant.Gender;
import com.batchDec2023.coreJava.exceptionhandling.userdefinedexceptions.MarriageAgeException;

public class Runner {

    public static void main(String[] args)  {
        Human rahul = new Human(Gender.MALE, "rahul", 21);
        Human simran = new Human(Gender.FEMALE, "simran", 18);
        boolean isMarriageResgistered;
        try {
              isMarriageResgistered = MarriageRegistrar.register(rahul, simran);
              rahul = null;
              rahul.getAge();
        }catch (MarriageAgeException e){
            System.out.println("EXCEPTION : Marrage age exception humans underage");
            isMarriageResgistered = false;
        }
        System.out.println("Marriage registered :  " + isMarriageResgistered);
    }
}
