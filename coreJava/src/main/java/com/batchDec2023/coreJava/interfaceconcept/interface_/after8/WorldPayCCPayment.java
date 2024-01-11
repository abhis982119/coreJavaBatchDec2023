package com.batchDec2023.coreJava.interfaceconcept.interface_.after8;

public class WorldPayCCPayment  implements ICCPayment, IPayment, IA{

    @Override
    public void redirectToGateway() {
        System.out.println("redirected to WORLD PAY Ngateway ");
    }

    @Override
    public void readResponseFromGateway() {
        System.out.println("check payment  WORLD PAY gateway response ");
    }

    public void m2(){
        doPayment();
        m1();
    }
}
