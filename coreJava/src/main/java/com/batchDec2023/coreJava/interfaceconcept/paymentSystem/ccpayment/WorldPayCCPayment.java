package com.batchDec2023.coreJava.interfaceconcept.paymentSystem.ccpayment;

public class WorldPayCCPayment extends CCPayment{


    @Override
    public void redirectToGateway() {
        System.out.println("redirected to WORLD PAY gateway ");
    }

    @Override
    public void readResponseFromGateway() {
        System.out.println("check payment  WORLD PAY gateway response ");
    }

}
