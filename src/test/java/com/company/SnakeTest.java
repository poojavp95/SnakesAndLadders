package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SnakeTest {

    @Test
    void shouldThrowExceptionWhenStartPositionIsLessThanEndPosition() {
        assertThrows(IllegalArgumentException.class, () -> new Snake(10, 100));
    }
}