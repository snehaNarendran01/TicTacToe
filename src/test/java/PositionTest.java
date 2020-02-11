import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PositionTest {
    @Test
    public void shouldReturnTrueIfRowIndexOfThreePositionsAreEqual() {
        Position positionOne = new Position(1, 2);
        Position positionTwo = new Position(1, 0);
        Position positionThree = new Position(1, 1);

        assertTrue(positionOne.compareWith(positionTwo, positionThree));
    }
}