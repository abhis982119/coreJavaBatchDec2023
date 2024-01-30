package com.batchDec2023.coreJava.exceptionhandling.trycatch;

import java.util.Scanner;

public class TryWithResouces {

    public static void main(String[] args) {


        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Please enter a integer : ");
            System.out.println( "You entered : " + scanner.nextInt());

        }catch (Exception e){
            System.out.println("Exception arised : " + e.getMessage());
        }
    }
}
