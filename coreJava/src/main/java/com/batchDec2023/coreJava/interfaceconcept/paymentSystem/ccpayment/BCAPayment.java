package com.batchDec2023.coreJava.interfaceconcept.paymentSystem.ccpayment;

public class BCAPayment extends  CCPayment{


    @Override
    public void redirectToGateway() {
        System.out.println("redirected to BCA gateway ");
    }

    @Override
    public void readResponseFromGateway() {
        System.out.println("check payment BCA gateway response ");
    }


}