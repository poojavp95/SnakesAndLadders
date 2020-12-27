package com.company;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Integer size;
    private List<Snake> snakes;

    public Board(Integer size) {
        this.size = size;
        snakes = new ArrayList<>();
    }

    public Integer getSize() {
        return size;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public void addSnake(Snake snake){
        for (Snake s: snakes){
            if(s.getStartPosition().equals(snake.getStartPosition())){
                throw new IllegalArgumentException("Cannot add two snakes with same start position");
            }
        }
        snakes.add(snake);
    }
}
