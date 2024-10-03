package wk5;

public class UnsignedInteger {
    private int value;

    // Constructor
    public UnsignedInteger() {
        value = (int)(Math.random() * 10);
    }

    /**
     * Constructor
     * @param val value to be used. If negative, sets object value to 0
     */
    public UnsignedInteger(int val) {
        value = Math.max(0, val);
    }

    public boolean changeValue(int val) {
        boolean changed = false;
        if (val != value && val >= 0) {
            value = val;
            changed = true;
        }
        return changed;
    }

    public String toString() {
        return "" + value;
    }
}
