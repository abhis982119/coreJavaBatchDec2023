package com.batchDec2023.coreJava.exceptionhandling.trycatch;

public class NestedTryCatchBlock {

    public static void main(String[] args) {
        try{
            System.out.println("payment comfirming please wait ...");
            try {
                 Thread.sleep(3000);
                 int value = 10/0;
            }catch (ArithmeticException  | InterruptedException e){
                System.out.println("Unable to confirm payment, please check in a while");
                return;
            }
            System.out.println("payment confirmed.");
        }catch (ArithmeticException e){
            System.out.println("Outer Catch Exception " + e.getMessage());
        }
    }
}
