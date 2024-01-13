package com.batchDec2023.coreJava.interfaceconcept.paymentSystem;

import com.batchDec2023.coreJava.interfaceconcept.interface_.IPayment;

public final class PaymentHelper {

    public static  void doPayment(double amount, IPayment payment){
        payment.doPayment();
    }
}
