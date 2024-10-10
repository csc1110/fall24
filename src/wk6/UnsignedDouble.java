package wk6;

/*
    +------------------------------------------+
    |              UnsignedDouble              |
    +------------------------------------------+
    | - value: double                          |
    +------------------------------------------+
    | + UnsignedDouble(value: double)          |
    | + changeValue(value: double) : boolean  |
    | + getValue() : double                    |
    | + toString() : String                    |
    +------------------------------------------+
 */
public class UnsignedDouble {
    private double value;
    public UnsignedDouble(double value) {
        this.value = Math.max(0, value);
    }
    public boolean changeValue(double value) {
        boolean changed = false;
        if (value >= 0 && this.value != value) {
            this.value = value;
            changed = true;
        }
        return changed;
    }
    public double getValue() {
        return value;
    }
    public String toString() {
        return Double.toString(value);
    }
}
