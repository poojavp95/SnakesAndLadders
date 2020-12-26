package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    @Test
    void shouldGetARandomNumberBetweenOneAndSix() {
        Dice dice = new Dice();
        Integer move = dice.getMove();
        assertTrue(move >= 1 && move <= 6);
    }
}