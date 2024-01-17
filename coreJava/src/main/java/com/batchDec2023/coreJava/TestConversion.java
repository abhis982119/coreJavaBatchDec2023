package com.batchDec2023.coreJava;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.HashMap;
import java.util.Map;


public class TestConversion {

    public static void main(String[] args) {
        String sessionData = "{\n" +
                " \n" +
                "                      \"name\":\"value\",\n" +
                "                      \"Spring_security_impl\" : {},\n" +
                "                      \"age\":3\n" +
                "\n" +
                "       \n" +
                "\n" +
                "\n" +
                "}";

        System.out.println(sessionData);


        Map<String, Object>  data = new HashMap<>();
        data.put("name","Ashish");
        data.put("Spring_security_context ",new Object());


        try {
            Gson gson = new GsonBuilder()
                    .create();


          String  newSessinData =    gson.toJson(data);


             Map<String,Object> session =  gson.fromJson(sessionData, HashMap.class);
             Object  securityContext = session.get("Spring_security_impl");
             if(securityContext == null){
                 System.out.println("Not validated");
             }else{
                 System.out.println("validated");
             }

        } catch (Exception e) {
            System.out.println("Error");
            throw e;
        }



    }
}
