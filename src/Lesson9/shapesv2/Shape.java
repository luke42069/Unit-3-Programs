
package Lesson9.shapesv2;
import Lesson9.shapesv1.*;
import TurtleGraphics.Pen;
import java.awt.Color;


public abstract class Shape {
   protected double xPos, yPos;
   
   public Shape(double x, double y){
       xPos=x;
       yPos=y;
   }
   
   public Shape(){
       xPos = 0;
       yPos = 0;
   }
   
   abstract public double area();
   abstract public void draw(Pen p);
   abstract public void stretchBy(double factor);
   abstract public double perimeter();
   
   //final methods can never be overridden by child classes
   final public double getXPos(){
    return xPos;
}
   final public double getYPos(){
       return yPos;
   }
   
   
   public void move(double xLoc, double yLoc){
       xPos=xLoc;yPos=yLoc;
   }
   
   public String toString(){
       String str = "XPos: "+xPos+" YPos: "+yPos;
       str += String.format("\nArea: %.2f", area());
       return str;
   }
}
