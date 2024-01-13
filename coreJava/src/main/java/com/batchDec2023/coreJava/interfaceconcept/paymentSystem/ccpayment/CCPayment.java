package com.batchDec2023.coreJava.interfaceconcept.paymentSystem.ccpayment;

import com.batchDec2023.coreJava.interfaceconcept.interface_.IPayment;

public  abstract class CCPayment implements IPayment {

    public final void getCCDetails() {
        System.out.println("CC details fetched ");
    }

    public void saveCCDetails(){
        System.out.println("Masked CC details & saved to db");
    }

    public final void doPayment(){
        getCCDetails();
        redirectToGateway();
        readResponseFromGateway();
    }

    public abstract void redirectToGateway();

    public abstract void readResponseFromGateway();

}
