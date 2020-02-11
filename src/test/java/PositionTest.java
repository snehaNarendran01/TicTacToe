import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PositionTest {
    @Test
    public void shouldReturnTrueIfRowIndexOfThreePositionsAreEqual() {
        Position positionOne = new Position(1, 2);
        Position positionTwo = new Position(1, 0);
        Position positionThree = new Position(1, 1);

        assertTrue(positionOne.compareWith(positionTwo, positionThree));
    }

    @Test
    public void shouldReturnFalseIfRowIndicesOfThreePositionsAreNotEqual() {
        Position positionOne = new Position(1, 2);
        Position positionTwo = new Position(2, 0);
        Position positionThree = new Position(1, 1);

        assertFalse(positionOne.compareWith(positionTwo, positionThree));
    }

    @Test
    public void shouldReturnTrueIfColumnIndicesOfThreePositionsAreEqual() {
        Position positionOne = new Position(1, 1);
        Position positionTwo = new Position(2, 1);
        Position positionThree = new Position(1, 1);

        assertTrue(positionOne.compareWith(positionTwo, positionThree));
    }

    @Test
    public void shouldReturnFalseIfColumnIndicesOfThreePositionsAreNotEqual() {
        Position positionOne = new Position(1, 1);
        Position positionTwo = new Position(2, 3);
        Position positionThree = new Position(1, 1);

        assertFalse(positionOne.compareWith(positionTwo, positionThree));
    }
}