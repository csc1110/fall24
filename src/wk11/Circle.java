package wk11;

import java.awt.*;

public class Circle extends Shape {
    public Circle() {
        super(Color.BLACK, 0, 0);
    }

    public Circle(Color color, double x, double y) {
        super(color, x, y);
    }

    @Override
    public String toString() {
        return "circle is me";
    }
}
