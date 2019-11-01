
package Lesson9.shapesV2;

import TurtleGraphics.Pen;

public class Triangle extends Shape {

    private double x2, x3, y2, y3;

    public Triangle(int x, int y, double a, double b, double c, double d) {
        super(x, y);
        x2 = a;
        x3 = b;
        y2 = c;
        y3 = d;
    }

    @Override
    double area() {
        return Math.abs((xPos * y2 - x2 * yPos) + (x2 * y3 - x3 * y2) + (x3 * yPos - xPos * y3)) / 2;
    }

    @Override
    public void draw(Pen p) {
        p.up();
        p.move(xPos, yPos);
        p.down();
        p.move(x2, y2);
        p.move(x3, y3);
        p.move(xPos, yPos);
    }

    @Override
    public void stretchBy(double factor) {
        x2 = (x2 - xPos) * factor + xPos;
        x3 = (x3 - xPos) * factor + xPos;
        y2 = (y2 - yPos) * factor + yPos;
        y3 = (y3 - yPos) * factor + yPos;
    }

    public String toString() {
        double length = x2 - xPos;
        String str = "Triangle\n======\n";
        str += String.format("\nLengths: %.2fm by %.2fm by %.2fm", length, length, length);
        str += super.toString();
        return str;
    }
    
    public void move(final double xLoc, final double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
        x2 = x2 + xLoc;
        x3 = x3 + xLoc;
        y2 = y2 + yLoc;
        y3 = y3 + yLoc;
    }

    @Override
    public double perimeter() {
        return Math.sqrt((xPos - x2) * (xPos - x2) + (yPos - y2) * (yPos - y2));
    }

}
