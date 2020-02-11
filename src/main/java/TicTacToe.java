import java.util.Objects;

public class TicTacToe {

    private final Player playerOne;
    private final Player playerTwo;

    public TicTacToe(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public Player getWinner() {
        if (playerOne.moves().get(0).compareWith(playerOne.moves().get(1), playerOne.moves().get(1)))
            return playerOne;
        return playerTwo;
    }
}
