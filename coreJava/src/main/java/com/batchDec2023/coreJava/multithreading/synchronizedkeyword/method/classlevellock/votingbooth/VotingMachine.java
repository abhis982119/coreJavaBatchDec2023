package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.method.classlevellock.votingbooth;

import lombok.Getter;

@Getter
public class VotingMachine {

    private int totalVote; //0

    public synchronized void castVote(){  //t1 -lock  //t2
            int totalVoteCurrent = totalVote;  // t1
            totalVote = totalVoteCurrent+1;  // t1 : 1

    }


}
