public class Position {
    private int rowIndex;
    private int columnIndex;

    public Position(int rowIndex, int columnIndex) {
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
    }

    public boolean compareWith(Position positionTwo, Position positionThree) {
        return (this.rowIndex == positionTwo.rowIndex && positionTwo.rowIndex == positionThree.rowIndex)
                || (this.columnIndex == positionTwo.columnIndex && positionTwo.columnIndex == positionThree.columnIndex);
    }
}
