package wk6;

public class Square {
    // Instance variables
    private char fillCharacter;
    private int length;

    // Class Constant
    private final static char DEFAULT_FILL_CHARACTER = '*';

    public Square(char fillCharacter, int length) {
        this.fillCharacter = fillCharacter;
        this.length = length;
    }

    public Square(int length) {
        this.fillCharacter = DEFAULT_FILL_CHARACTER;
        this.length = length;
    }

    public String toString() {
        String result = "";
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                result += fillCharacter;
            }
            result += "\n";
        }
        return result;
    }
}
