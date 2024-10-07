package wk6;

public class Rectangle {
    private char fillCharacter;
    private int width;
    private int height;

    /**
     * Creates a rectangle object with the specified state
     * @param fillCharacter The character to be used for the string representation
     * @param width The width of the rectangle, set to 1 if invalid
     * @param height The height of the rectangle, set to 1 if invalid
     */
    public Rectangle(char fillCharacter, int width, int height) {
        this.fillCharacter = fillCharacter;
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1;
        }
        if (height > 0) {
            this.height = height;
        } else {
            this.height = 1;
        }
    }

    /**
     * Sets the height of the rectangle. Left unchanged if <code>height</code>
     * is non-positive.
     * @param width The width of the rectangle
     */
    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    /**
     * Sets the height of the rectangle. Left unchanged if <code>height</code>
     * is non-positive.
     * @param height The height of the rectangle
     */
    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        }
    }

    /**
     * Sets the fill character to be used to make the string representation
     * of the rectangle
     * @param fillCharacter Desired fill character
     */
    public void setFillCharacter(char fillCharacter) {
        this.fillCharacter = fillCharacter;
    }

    /**
     * String representation of the rectangle
     * @return A multiline string representing the rectangle
     */
    public String toString() {
        String shape = "";
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                shape += fillCharacter;
            }
            shape += "\n";
        }
        return shape;
    }
}
