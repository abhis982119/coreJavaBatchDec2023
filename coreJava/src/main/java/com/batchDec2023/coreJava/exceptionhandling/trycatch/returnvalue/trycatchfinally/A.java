package com.batchDec2023.coreJava.exceptionhandling.trycatch.returnvalue.trycatchfinally;

public class A {

    public int m1() {
        int a = 10;
        try {
            a = a * a;
            a = a / 0;
        } catch (Exception e) {
            a = a + 10;
        } finally {
            a = a + 20;
        }
        return a;
    }


    public int m2(){
        int a= 10;
        try{
            a = a*a;
            a = a/0;
        }catch (Exception e){
            System.out.println("catch block executed ");
            a = a+10;
            return a;

        }finally {
            a = a+20;
            System.out.println("value of a in finally block  " + a);
            System.out.println("finally block executed");
        }
        return a;
    }

    public int m3(){
        int a= 10;
        try{
            a = a*a;
            a = a/0;
        }catch (Exception e){
            System.out.println("catch block executed ");
            a = a+10;
            return a;

        }finally {
            a = a+20;
           return a;
        }

    }
}


/*

----
STACK
m2()
----
int a = 10;
    a = 100;
    a = 110
    a = 130

------

-------
  return 110
-----



----
STACK
m3()
----
int a = 10;
    a = 100;
    a = 110
    a = 130 //final updated value

------

-------
  return 110  //catch
  return 130  //finally  // final updated value

-----
 */