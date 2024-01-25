package com.batchDec2023.coreJava.exceptionhandling.trycatch.returnvalue.trycatch;

public class A {

    public int m1(){
        int a= 10;
        try{
            a = a*a;
            throw new RuntimeException();
        }catch (Exception e){
            a = a+10;
            return a;
        }

    }

    public int m2(){
        int a= 10;
        try{
            a = a*a;
            a = a/0;
        }catch (Exception e){
            a = a+10;
            return a;
        }
        return a;
    }

    public int m3(){
        int a= 10;
        try{
            a = a*a;
            a = a/0;
        }catch (Exception e){
            a = a+10;
        }
        return a;
    }
}
