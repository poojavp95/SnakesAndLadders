import com.company.Board;
import com.company.dice.Dice;
import com.company.Player;
import com.company.SnakesAndLaddersGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SnakesAndLaddersGameTest {
    @Mock
    private Board board;

    @Mock
    private Dice dice;

    @Mock
    private Player player;

    private  SnakesAndLaddersGame snakesAndLaddersGame;

    @BeforeEach
    void setUp() {
        snakesAndLaddersGame = new SnakesAndLaddersGame(board, dice, singletonList(player));
    }

    @Test
    void shouldInitializePlayersPositionToZero() {
        Integer playerPosition = snakesAndLaddersGame.getPlayerPosition(player);

        assertEquals(0, playerPosition);
    }

    @Test
    void shouldSetPlayerPositionByIncreasingPositionToNumberOnDice() {
        when(dice.getMove()).thenReturn(4);
        when(board.getSize()).thenReturn(100);
        when(board.getPosition(4)).thenReturn(4);

        snakesAndLaddersGame.playTurn(player);

        assertEquals(4, snakesAndLaddersGame.getPlayerPosition(player));
    }

    @Test
    void shouldNotSetPlayerPositionIfItGoesOutsideBoard() {
        snakesAndLaddersGame.setPlayerPosition(player, 99);
        when(dice.getMove()).thenReturn(4);
        when(board.getPosition(103)).thenReturn(103);
        when(board.getSize()).thenReturn(100);

        snakesAndLaddersGame.playTurn(player);

        assertEquals(99, snakesAndLaddersGame.getPlayerPosition(player));
    }

}