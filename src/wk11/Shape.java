package wk11;

import java.awt.*;

public class Shape {
    private Color color;
    private double xCoord;
    private double yCoord;

    public Shape() {
        color = Color.BLACK;
        xCoord = 0;
        yCoord = 0;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shape(Color clr, double x, double y) {
        color = clr;
        xCoord = x;
        yCoord = y;
    }

    public void move(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    public void zoom() {

    }

    public void draw() {

    }

    public void erase() {

    }

    @Override
    public String toString() {
        return "happy is not the person who gets to class first";
    }
}
