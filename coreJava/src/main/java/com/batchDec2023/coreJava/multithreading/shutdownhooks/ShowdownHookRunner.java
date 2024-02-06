package com.batchDec2023.coreJava.multithreading.shutdownhooks;

public class ShowdownHookRunner {

    public static void main(String[] args) {
        Thread emailAlertTask = new Thread(() -> System.out.println("alert mail task"));
        Thread loggingTask = new Thread(()-> System.out.println("logging task"));
        Thread resourceCleaningTask = new Thread(()-> System.out.println("Resource cleaning"));

        Runtime runtime = Runtime.getRuntime();
        runtime.addShutdownHook(emailAlertTask);
        runtime.addShutdownHook(loggingTask);
        runtime.addShutdownHook(resourceCleaningTask);

        System.exit(0);


    }
}
