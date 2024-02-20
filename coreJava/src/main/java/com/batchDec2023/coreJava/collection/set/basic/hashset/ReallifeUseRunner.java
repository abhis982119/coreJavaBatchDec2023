package com.batchDec2023.coreJava.collection.set.basic.hashset;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReallifeUseRunner {

    public static void main(String[] args) {

        Set<Integer> acceptableHTTPResponseCodes = new HashSet<>();
        acceptableHTTPResponseCodes.add(200);
        acceptableHTTPResponseCodes.add(201);
        acceptableHTTPResponseCodes.add(401);

        int responseStatus = getResponseFromAirAsia();

        if(acceptableHTTPResponseCodes.contains(responseStatus)){  // 0(1)
            System.out.println("Continue with booking");
        }else{
            System.out.println("Put booking into suspended state, make ops team check for booking in airaisa portal");
        }
    }

    public static int getResponseFromAirAsia(){
            return 500;
    }
}
