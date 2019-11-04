
package Lesson9.shapesv2;

import Lesson9.shapesv1.*;
import TurtleGraphics.Pen;
import java.awt.Color;


public class Circle extends Shape{

    protected double radius; //protected = only for parent and children
    
    
    
    public Circle(double x, double y, double r){
        super(x,y);
        radius = r;
    }
    
    public Circle(){
        super();//call Shape default constructor
        radius = 10;
    }
    
    @Override
    public double area() {
        return Math.PI * radius*radius;
    }

    public double perimeter(){
        return Math.PI * 2 * radius;
    }
    
    public void draw(Pen p) {
        double side = (2*Math.PI*radius)/120;
        p.up();
        p.move(xPos,yPos);
        p.setDirection(0);
        p.move(radius);
        p.turn(90);
        p.down();
        
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }

  /*  public double getXPos(){
        System.out.println("Circle x pos is");
        return super.xPos;
    }*/

    
    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
        String str = "Circle\n======\n";
        str += "\n" + super.toString();
        str+= "\nRadius: "+radius;
        str+= String.format("\nCircumference: %.2f",perimeter());
        return str;
    }
    
    
    
    
    
}
