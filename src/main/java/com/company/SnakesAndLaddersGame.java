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

}
