package com.batchDec2023.coreJava.oops.inheritance.parentreferencevariable.bank;

public class NetBanking extends Payment{

    @Override
    public void doPayment() {
        System.out.println("doing Netbanking payment");
    }
}
