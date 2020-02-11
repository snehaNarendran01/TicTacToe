import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TicTacToeTest {
    @Test
    public void shouldReturnWinnerIfHePlacesHisArtifactsInTheSameRow() {
        Player playerOne = mock(Player.class);
        Player playerTwo = mock(Player.class);
        TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo);
        when(playerOne.move()).thenReturn(new Position(0, 0),
                new Position(0, 1), new Position(0, 2));
        when(playerTwo.move()).thenReturn(new Position(1, 1),
                new Position(2, 0), new Position(2, 1));

        assertEquals(playerOne, ticTacToe.play());
    }

    @Test
    public void shouldReturnWinnerIfHePlacesHisArtifactsInTheSameColumn() {
        Player playerOne = mock(Player.class);
        Player playerTwo = mock(Player.class);
        TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo);
        when(playerTwo.move()).thenReturn(new Position(0, 0),
                new Position(0, 2), new Position(0, 1));
        when(playerOne.move()).thenReturn(new Position(1, 1),
                new Position(2, 0), new Position(2, 1));

        assertEquals(playerTwo, ticTacToe.play());
    }
}