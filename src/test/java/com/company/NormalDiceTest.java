package com.company;

import com.company.dice.NormalDice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalDiceTest {
    @Test
    void shouldGetARandomNumberBetweenOneAndSix() {
        NormalDice dice = new NormalDice();
        Integer move = dice.getMove();
        assertTrue(move >= 1 && move <= 6);
    }
}