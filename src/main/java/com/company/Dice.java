package com.company;

import java.util.Random;

public class Dice {
    Integer getMove(){
        Random random = new Random();
        return random.nextInt() % 6 + 1;
    }
}
