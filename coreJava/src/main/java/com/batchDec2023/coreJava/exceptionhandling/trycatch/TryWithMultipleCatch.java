package com.batchDec2023.coreJava.exceptionhandling.trycatch;

import com.batchDec2023.coreJava.exceptionhandling.userdefinedexceptions.MarriageAgeException;

public class TryWithMultipleCatch {

    public static void main(String[] args) {
        Integer value = 0;
        try {

            value = null;
            value = value / 0;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException arised : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointer arised : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown exception arised : " + e.getMessage());
        }
    }
}
