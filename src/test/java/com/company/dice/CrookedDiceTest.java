package com.company.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrookedDiceTest {

    @Test
    void shouldGetARandomEvenNumberBetweenOneAndSix() {
        Dice dice = new CrookedDice();
        Integer move = dice.getMove();
        assertTrue(move >= 1 && move <= 6 && move % 2 ==0);
    }
}