package com.batchDec2023.coreJava.multithreading.join;

public class MarriageFlow {

    public static void main(String[] args) throws InterruptedException {
        Runnable girlAndBoyMeetTask = () -> System.out.println("Girl and Boy meet");

        Runnable agreeToMarryTask = () -> System.out.println("Agree to marry ");

        Runnable punditDateTask = () -> System.out.println("Pundit finalize marriage date");

        Runnable venueBookTask = () -> System.out.println("Venue book");

        Runnable printCardTask = () -> System.out.println("Print card task");

        Runnable buyWeddingClothes = () -> System.out.println("Wedding clothes");

        Runnable sendInviteTask = () -> System.out.println("Send invitation to guest");

        Runnable marriageComplete = () -> System.out.println("Marriage completes with regration");


        Thread matchMaker = new Thread(girlAndBoyMeetTask);
        Thread brideGroomAgreement = new Thread(agreeToMarryTask);
        Thread pundit = new Thread(punditDateTask);

        Thread brideSibling = new Thread(venueBookTask);
        Thread brideFather = new Thread(printCardTask);
        Thread brideMother = new Thread(buyWeddingClothes);

        Thread brideUncle = new Thread(sendInviteTask);

        Thread brideGroomAgain = new Thread(marriageComplete);


        matchMaker.start();
        matchMaker.join();

        brideGroomAgreement.start();
        brideGroomAgreement.join();

        pundit.start();
        pundit.join();

        brideSibling.start();
        brideMother.start();
        brideSibling.join();

        brideFather.start();
        brideFather.join();


        brideUncle.start();
        brideUncle.join();

        brideGroomAgain.start();

    }
}
