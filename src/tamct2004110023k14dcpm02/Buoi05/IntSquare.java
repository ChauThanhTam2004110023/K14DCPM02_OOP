package tamct2004110023k14dcpm02.Buoi05;

public class IntSquare {
    private int squareValue;

    /* int getSquareOperator(int value)
    {
        squareValue = (int)Math.pow(value, 2);
        return squareValue;
    } */

    int getSquare(int value)
    {
        this.squareValue = this.calculateSquare(value);
        return this.squareValue;
    }

    private int calculateSquare(int value)
    {
        return (int)Math.pow(value, 2);
    }
}
