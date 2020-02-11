import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TicTacToeTest {
    private Player playerOne;
    private Position playerOnePositionOne;
    private Position playerOnePositionTwo;
    private Position playerOnePositionThree;
    private Player playerTwo;
    private Position playerTwoPositionOne;
    private Position playerTwoPositionTwo;
    private Position playerTwoPositionThree;

    private void initialize() {
        playerOne = mock(Player.class);
        playerOnePositionOne = mock(Position.class);
        playerOnePositionTwo = mock(Position.class);
        playerOnePositionThree = mock(Position.class);
        ArrayList<Position> playerOnePositions = new ArrayList<>(Arrays.asList(mock(Position.class),
                mock(Position.class), mock(Position.class)));
        when(playerOne.moves()).thenReturn(playerOnePositions);
        playerTwo = mock(Player.class);
        playerTwoPositionOne = mock(Position.class);
        playerTwoPositionTwo = mock(Position.class);
        playerTwoPositionThree = mock(Position.class);
        ArrayList<Position> playerTwoPositions = new ArrayList<>(Arrays.asList(playerTwoPositionOne,
                playerTwoPositionTwo, playerTwoPositionThree));
        when(playerTwo.moves()).thenReturn(playerTwoPositions);
    }

    @Test
    public void shouldReturnWinnerIfHePlacesHisArtifactsInTheSameRow() {
        initialize();
        when(playerOnePositionOne.compareWith(playerOnePositionTwo, playerOnePositionThree)).thenReturn(true);
        when(playerTwoPositionOne.compareWith(playerTwoPositionTwo, playerTwoPositionThree)).thenReturn(false);

        TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo);

        assertEquals(playerOne, ticTacToe.getWinner());
    }

    @Test
    public void shouldReturnWinnerIfHePlacesHisArtifactsInTheSameColumn() {
        initialize();
        when(playerOnePositionOne.compareWith(playerOnePositionTwo, playerOnePositionThree)).thenReturn(false);
        when(playerTwoPositionOne.compareWith(playerTwoPositionTwo, playerTwoPositionThree)).thenReturn(true);

        TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo);

        assertEquals(playerTwo, ticTacToe.getWinner());
    }

}