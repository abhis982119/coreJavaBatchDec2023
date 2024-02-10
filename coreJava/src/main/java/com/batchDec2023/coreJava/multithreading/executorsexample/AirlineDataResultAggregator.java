package com.batchDec2023.coreJava.multithreading.executorsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AirlineDataResultAggregator {

    public static void main(String[] args) throws Exception {

        Callable<String>  airasiaFlightResultTask = getAirAsiaFlightTask();
        Callable<String>  indigoFlightResultTask = getIndigoFlightTask();
        Callable<String>  vistaraFlightResultTask = getVistaraFlightTask();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<String> airAisaFlightResult = executorService.submit(airasiaFlightResultTask);
        Future<String> indigoFlightResult = executorService.submit(indigoFlightResultTask);
        Future<String> vistaraFlightResult = executorService.submit(vistaraFlightResultTask);


        List<String> flightresult = new ArrayList<>();
        flightresult.add(airAisaFlightResult.get());
        flightresult.add(indigoFlightResult.get());
        flightresult.add(vistaraFlightResult.get());

        System.out.println("Flight result received : " + flightresult);

    }

    private static Callable<String> getAirAsiaFlightTask() {
        return () -> {
            System.out.println(Thread.currentThread().getName() + " : Hit airasia url ");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() +  " : parse airaisa flight result");
            return "airAsia flight result";
        };
    }

    private static Callable<String> getIndigoFlightTask() {
        return () -> {
            System.out.println(Thread.currentThread().getName() +  " : Hit indigo url ");
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() +  " : parse indigo flight result");
            return "indigo flight result";
        };
    }

    private static Callable<String> getVistaraFlightTask() {
        return () -> {
            System.out.println(Thread.currentThread().getName() + " : Hit vistara url ");
            System.out.println(Thread.currentThread().getName() +  " : parse vistara flight result");
            Thread.sleep(6000);
            return "visatara flight result";
        };
    }
}
