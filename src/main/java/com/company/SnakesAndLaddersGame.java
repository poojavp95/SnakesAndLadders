package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnakesAndLaddersGame {
    private Board board;
    private Dice dice;
    private Map<Player, Integer> playerPosition;

    public SnakesAndLaddersGame(Board board, Dice dice, List<Player> players) {
        this.board = board;
        this.dice = dice;
        playerPosition = new HashMap<>();
        for (Player player: players) {
            playerPosition.put(player, 0);
        }
    }

    public Integer getPlayerPosition(Player player) {
        return playerPosition.get(player);
    }

    public void setPlayerPosition(Player player, Integer position) {
         playerPosition.put(player, position);
    }

    public void playTurn(Player player) {
        Integer diceMove = dice.getMove();
        Integer oldPosition = getPlayerPosition(player);
        Integer newPosition = board.getPosition(oldPosition + diceMove);
        if(newPosition <= board.getSize()){
            setPlayerPosition(player, newPosition);
            System.out.println("Player new position " + newPosition);
        }else {
            System.out.println("Cannot make the move");
        }
    }
}
