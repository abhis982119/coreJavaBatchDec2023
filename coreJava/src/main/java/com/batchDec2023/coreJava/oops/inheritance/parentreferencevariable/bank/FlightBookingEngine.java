package com.batchDec2023.coreJava.oops.inheritance.parentreferencevariable.bank;

public class FlightBookingEngine {

    public static void main(String[] args) {

        System.out.println("Checking flight availability");
        System.out.println("Block flight seat");
        String paymentMode = "NB";
        Double amount = 200.00;

       PaymentHelper.doPayment(amount,paymentMode);
    }
}
