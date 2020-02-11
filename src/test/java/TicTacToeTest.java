import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TicTacToeTest {
    @Test
    public void shouldReturnWinnerIfHePlacesHisArtifactsInTheSameRow() {
        Player playerOne = mock(Player.class);
        Position playerOnePositionOne = mock(Position.class);
        Position playerOnePositionTwo = mock(Position.class);
        Position playerOnePositionThree = mock(Position.class);
        ArrayList<Position> playerOnePositions = new ArrayList<>(Arrays.asList(playerOnePositionOne,
                playerOnePositionTwo, playerOnePositionThree));
        when(playerOne.moves()).thenReturn(playerOnePositions);
        Player playerTwo = mock(Player.class);
        Position playerTwoPositionOne = mock(Position.class);
        Position playerTwoPositionTwo = mock(Position.class);
        Position playerTwoPositionThree = mock(Position.class);
        ArrayList<Position> playerTwoPositions = new ArrayList<>(Arrays.asList(playerTwoPositionOne,
                playerTwoPositionTwo, playerTwoPositionThree));
        when(playerTwo.moves()).thenReturn(playerTwoPositions);
        when(playerOnePositionOne.compareWith(playerOnePositionTwo, playerOnePositionThree)).thenReturn(true);
        when(playerTwoPositionOne.compareWith(playerTwoPositionTwo, playerTwoPositionThree)).thenReturn(false);

        TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo);

        assertEquals(playerTwo, ticTacToe.getWinner());
    }

    @Test
    public void shouldReturnWinnerIfHePlacesHisArtifactsInTheSameColumn() {
        Player playerOne = mock(Player.class);
        Position playerOnePositionOne = mock(Position.class);
        Position playerOnePositionTwo = mock(Position.class);
        Position playerOnePositionThree = mock(Position.class);
        ArrayList<Position> playerOnePositions = new ArrayList<>(Arrays.asList(playerOnePositionOne,
                playerOnePositionTwo, playerOnePositionThree));
        when(playerOne.moves()).thenReturn(playerOnePositions);
        Player playerTwo = mock(Player.class);
        Position playerTwoPositionOne = mock(Position.class);
        Position playerTwoPositionTwo = mock(Position.class);
        Position playerTwoPositionThree = mock(Position.class);
        ArrayList<Position> playerTwoPositions = new ArrayList<>(Arrays.asList(playerTwoPositionOne,
                playerTwoPositionTwo, playerTwoPositionThree));
        when(playerTwo.moves()).thenReturn(playerTwoPositions);
        when(playerOnePositionOne.compareWith(playerOnePositionTwo, playerOnePositionThree)).thenReturn(false);
        when(playerTwoPositionOne.compareWith(playerTwoPositionTwo, playerTwoPositionThree)).thenReturn(true);

        TicTacToe ticTacToe = new TicTacToe(playerOne, playerTwo);

        assertEquals(playerTwo, ticTacToe.getWinner());
    }

}