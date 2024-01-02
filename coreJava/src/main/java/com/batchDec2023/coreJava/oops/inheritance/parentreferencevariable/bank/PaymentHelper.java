package com.batchDec2023.coreJava.oops.inheritance.parentreferencevariable.bank;

public class PaymentHelper {

    public static void doPayment(double amount, String type){
         Payment payment = getPaymentObject(type);
         payment.doPayment();
    }

    public static Payment getPaymentObject(String paymentMode){
        switch (paymentMode){
            case "CASH":
                return new Payment();
            case "CC":
                return new CCPayment();
            case "NB":
                return new NetBanking();
            default:
                throw new RuntimeException("Payment mode don't exist");
        }
    }



}
