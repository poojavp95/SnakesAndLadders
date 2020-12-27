package com.company;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BoardTest {
    @Test
    void shouldAddSnakesOnTheBoard() {
        Board board = new Board(100);
        Snake snake = new Snake(14, 7);

        board.addSnake(snake);

        assertThat(board.getSnakes(), hasItem(snake));
    }

    @Test
    void shouldNotAddSnakeIfThereIsAlreadyOneWithSameStartPosition() {
        Board board = new Board(100);
        Snake someSnake = new Snake(14, 7);
        Snake anotherSnakeWithSameStart = new Snake(14, 10);

        board.addSnake(someSnake);
        assertThrows(IllegalArgumentException.class,() -> board.addSnake(anotherSnakeWithSameStart));
    }
}