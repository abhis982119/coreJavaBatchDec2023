package com.batchDec2023.coreJava.userenum.constant;

public class ErrorCodeEnumRunner {

    public static void main(String[] args) {
        System.out.println("line-1");
        System.out.println("line-2");
        System.out.println("line-3");
        double randomNumber =  Math.floor(Math.random()*10);
        System.out.println("value " + randomNumber);

        if(randomNumber > 5){
            throw new RuntimeException(ErrorCode.ERROR_CODE_101.getErrorMsg());
        }
        System.out.println("line-4");
        System.out.println("line-5");
    }
}
