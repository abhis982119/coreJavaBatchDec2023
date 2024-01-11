package com.batchDec2023.coreJava.interfaceconcept.flightteam;

import com.batchDec2023.coreJava.interfaceconcept.paymentSystem.PaymentHelper;
import com.batchDec2023.coreJava.interfaceconcept.paymentSystem.ccpayment.BCAPayment;
import com.batchDec2023.coreJava.interfaceconcept.paymentSystem.ccpayment.WorldPayCCPayment;

public class Runner {

    public static void main(String[] args) {
        double flightAmount = 200;

          PaymentHelper.doPayment(200, new WorldPayCCPayment());
     //   PaymentHelper.doPayment(200, new BCAPayment());
    }
}
