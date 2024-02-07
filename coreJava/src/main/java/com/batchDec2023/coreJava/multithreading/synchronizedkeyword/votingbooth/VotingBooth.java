package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.votingbooth;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VotingBooth {

    private VotingMachine voteMachine;



    public void castVote(){
        voteMachine.castVote();
    }


}
