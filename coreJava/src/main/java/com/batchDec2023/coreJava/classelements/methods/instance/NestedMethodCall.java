package com.batchDec2023.coreJava.classelements.methods.instance;

public class NestedMethodCall {

    private int windowSize; // 4 byte
    private char b; // 2 byte

    public static void main(String[] args) {
        NestedMethodCall call = new NestedMethodCall();
        call.m1(20, call);
    }

    public void m1(int b, NestedMethodCall nestedMethodCall){
        int a = 10;
        nestedMethodCall.windowSize = 10;
        System.out.println("m1()");
        m2();
        System.out.println("m1()");
    }

    public void m2(){
        int c = 10;
        System.out.println("m2()");
    }
}

/*                                                              heap               non-heap
  STACK                                                         879965
  ---------                                                     NestedMethodCall{a=10}                                                                  {int a}
  --------         ------       ------
  main()            m1()          m2
  --------        -------        -----
  args[]           int b=20
  call=879965      int a=10
  int b = 20       call=879965
  --------        ------         ------
  m1() ----->      m2() ----->
  --------        ------         ------
  7      <-----    12    <-----  m2()
  --------        ------         -------
                   "ok"          "done"
  --------        -------        -------


 */

/* CONSOLE
m1()
m2()
m1()
 */