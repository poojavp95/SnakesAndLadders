package com.company.dice;

import java.util.Random;

public class NormalDice implements Dice{
    @Override
    public Integer getMove(){
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
