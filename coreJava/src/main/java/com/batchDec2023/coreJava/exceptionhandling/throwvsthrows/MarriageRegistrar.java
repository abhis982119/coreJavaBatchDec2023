package com.batchDec2023.coreJava.exceptionhandling.throwvsthrows;

import com.batchDec2023.coreJava.exceptionhandling.throwvsthrows.constant.Gender;
import com.batchDec2023.coreJava.exceptionhandling.userdefinedexceptions.MarriageAgeException;

public class MarriageRegistrar {


    public static boolean register(Human male, Human female) throws MarriageAgeException {

        if( male.getAge() < 21){
             throw new MarriageAgeException("Legal age of men is 21");
        }

        if(female.getAge() < 18){
             throw new MarriageAgeException("Legal age of women is 18");
        }

        return true;
    }
}
