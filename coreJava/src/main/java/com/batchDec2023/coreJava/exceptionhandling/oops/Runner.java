package com.batchDec2023.coreJava.exceptionhandling.oops;

public class Runner {

    public static void main(String[] args) {
        CCPayment ccPayment = new CCPayment();
        ccPayment.doPayment();
        ccPayment.fetchPaymentDetails();
    }
}
