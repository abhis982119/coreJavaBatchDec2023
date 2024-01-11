package com.batchDec2023.coreJava.office;



import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingLoop {

    public static void main(String[] args) {

          String ap1 = "TimePeriod";
          String ap2 = "MandatorySelectedAddOn";

          String sp1 = "TimePeriod";
          String sp2 = "MandatorySelectedAddOn";

           List<String> aps =  Arrays.asList(ap1, ap2);
           List<String> sps =  Arrays.asList(sp1, sp2);




        for(String ap : aps ){
            for(String sp : sps){
                if(ap.equals(sp)){
                    System.out.println(ap + "  " + sp  + " : same ");
                    break;
                }
            }
        }
    }
}
