package com.aparkermedia.funfacts;

import java.util.Random;

/**
 * Created by Arron on 26/01/2015.
 */
public class FactBook {
    public  String[] mFunFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches run faster than horses.",
            "Olympic gold medals are made from mostly silver.",
            "You are born with 300 bones, by the time your an adult you will hav 206.",
            "It takes about 8 minutes for light from the sun to reach earth.",
            "Some bamboo plants can grow almost a meter in one day.",
            "The state of florida is bigger than england.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average is takes 66 days to form a new habit",
            "Mammoths still walked the earth when the great pyramid was being built."
    };

    public String getFact(){

        String fact = "";


        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFunFacts.length);


        fact = mFunFacts[randomNumber];

        return fact;
    }
}
