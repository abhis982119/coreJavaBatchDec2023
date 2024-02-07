package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.votingbooth;

public class Runner {


    public static void main(String[] args) throws InterruptedException {
        VotingMachine votingMachine = new VotingMachine();
        VotingBooth votingBooth = new VotingBooth(votingMachine);

       for(int i = 0 ; i < 20; i++) {
           Thread castVoteThread1 = new Thread(getCastVoteTask(votingBooth));
           castVoteThread1.start();
       }

        Thread.sleep(3000);
        System.out.println("Total vote casted : " + votingMachine.getTotalVote());
    }

    private static Runnable getCastVoteTask(VotingBooth votingBooth) {
         Runnable castVoteTask = () -> {
            for (int i = 0; i < 1000; i++) {
                Thread thread = new Thread(() -> votingBooth.castVote());
                thread.start();
            }
        };
         return castVoteTask;
    }
}
