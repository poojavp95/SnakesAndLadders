package com.company;

import com.company.dice.CrookedDice;
import com.company.dice.Dice;
import com.company.dice.NormalDice;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    Board board = new Board(100);
	    board.addSnake(new Snake(14, 7));

	    Dice dice = new NormalDice();
//	    Dice dice = new CrookedDice();
	    Player player = new Player("0001", "Player1");

        SnakesAndLaddersGame snakesAndLaddersGame = new SnakesAndLaddersGame(board,
            dice,
            Collections.singletonList(player));

        for (int i = 0; i < 10; i++) {
            snakesAndLaddersGame.playTurn(player);
        }
    }
}
