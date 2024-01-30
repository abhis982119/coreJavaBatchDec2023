package com.batchDec2023.coreJava.exceptionhandling.oops;

public class CCPayment implements IPayment{
    @Override
  //  public void doPayment() throws Exception{  //  overridden method does not throw java.lang.Exception
    public void doPayment(){
        System.out.println("doPayment without Excpetion");
    }

    @Override
    public void fetchPaymentDetails()  { // parent method is throws Exception, but child doesn't which is  allowd
        System.out.println("fetchPaymentDetails without Exception ");
    }
}
