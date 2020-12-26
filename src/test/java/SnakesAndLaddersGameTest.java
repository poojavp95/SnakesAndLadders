import com.company.Board;
import com.company.Dice;
import com.company.Player;
import com.company.SnakesAndLaddersGame;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import static java.util.Collections.singletonList;
import static org.junit.jupiter.api.Assertions.assertEquals;

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


}