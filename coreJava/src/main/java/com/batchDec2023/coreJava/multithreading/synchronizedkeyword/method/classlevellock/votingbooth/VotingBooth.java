package com.batchDec2023.coreJava.multithreading.synchronizedkeyword.method.classlevellock.votingbooth;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class VotingBooth {

    private VotingMachine voteMachine;



    public void castVote(){
        voteMachine.castVote();
    }


}
