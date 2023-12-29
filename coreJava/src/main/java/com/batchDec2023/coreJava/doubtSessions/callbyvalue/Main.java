package com.batchDec2023.coreJava.doubtSessions.callbyvalue;

public class Main {
    public static void main(String[] args) {
        Square square1=new Square();
        square1.length=10;

        Square square2=new Square();
        square2.length=5;

        System.out.println("Square1 length before: "+square1.length);
        System.out.println("Square2 length before: "+square2.length);

       // swap(square1,square2);

        System.out.println("Square1 length after: "+square1.length);
        System.out.println("Square2 length after: "+square2.length);
    }

    public static void swap(Square square1,Square square2){
        Square tmp=square1;
        square1=square2;
        square2=tmp;
    }
}


/*
------                -------                         -----------
main                    swap                               Heap
------                --------                       -------------
                                                      123
square1 = 123        square1 = 321                    square1{int length= 10}
square2 = 321        square2 = 123
                                                      321
                                                      square2{int length  = 5}

------              ----------                           ------------------

------

------




 */