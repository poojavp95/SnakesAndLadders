package com.company;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;

class BoardTest {
    @Test
    void shouldAddSnakesOnTheBoard() {
        Board board = new Board(100);
        Snake snake = new Snake(14, 7);

        board.addSnake(snake);

        assertThat(board.getSnakes(), hasItem(snake));
    }
}