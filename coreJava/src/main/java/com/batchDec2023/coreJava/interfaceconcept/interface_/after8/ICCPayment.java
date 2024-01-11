package com.batchDec2023.coreJava.interfaceconcept.interface_.after8;

public interface ICCPayment extends IPayment{

    default void doPayment(){
        getCCDetails();
        redirectToGateway();
        readResponseFromGateway();
    }


    public abstract void redirectToGateway();

    public abstract void readResponseFromGateway();

    default void getCCDetails(){
        System.out.println("CC details fetched ");
    }



}
