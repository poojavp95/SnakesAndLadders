package com.company.dice;

import java.util.Random;

public class CrookedDice implements Dice{

    @Override
    public Integer getMove() {
        return (new Random().nextInt(3) + 1) * 2;
    }
}
