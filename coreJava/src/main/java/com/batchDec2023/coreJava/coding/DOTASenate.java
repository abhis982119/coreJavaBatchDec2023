package com.batchDec2023.coreJava.coding;

import java.util.HashMap;
import java.util.Map;

public class DOTASenate {

    public static void main(String[] args) {
       /* String senate = "RDD";


        Map<Character, Integer> playerMap = new HashMap<>();
        for(char ch : senate.toCharArray()){
            playerMap.compute(ch, (k,v) -> v == null ? 1 : v+1);
        }



        for(int i = 0; i < senate.length(); i++){
            if(!playerMap.containsKey(getCompetitorTeam(ch))){
                System.out.println("Winner is " + ch);
                return ;
            }

            int index = i;
            char cChar = '';
            while( cChar != getCompetitorTeam(arr[])){

            }
        }*/
      /*  for(int i = 0; i < n; i++){
            if(senate.charAt(i) == R){

            }
        }*/
    }

    public static char getCompetitorTeam(char ch ){
        return ch == 'R' ? 'D' : 'R';
    }
}
