package com.batchDec2023.coreJava.multithreading.locksexample.washroomwithlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockRunner {


    public static void main(String[] args) {
        WashRoom washRoom = new WashRoom();

        Runnable useWashRoomTask = () -> {
            washRoom.useToilet();
        };

        Runnable useWashBasinTask = () -> {
            washRoom.useWashBasin();
        };


        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0 ; i < 2 ; i++){
            executorService.submit(useWashRoomTask);
            executorService.submit(useWashBasinTask);
        }

        executorService.shutdown();
    }
}
