package com.company;

import java.util.Random;

public class Weather {

    public String forecast(){
        Random rand = new Random();
        if(rand.nextInt(10) > 6){
            return "stormy";
        }
        else{
            return "sunny";
        }
    }
}
