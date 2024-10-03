package wk5;

public class UnsignedInteger {
    int value;

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
