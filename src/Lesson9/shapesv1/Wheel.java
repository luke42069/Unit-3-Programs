
package Lesson9.shapesv1;

import TurtleGraphics.Pen;


public class Wheel extends Circle{
    
    private double spokes;
    //wheel has 4 properties
    //it inherits x, y, radius from Circle
    
    public Wheel(double x, double y, double r,double s){
        super(x,y,r); //call the Parent class constructor (parent class = super class, child class = sub class
        spokes = s;
    }
    
    //all methods from Circle are available to wheel by default
    
    //some methods -> area, getx&y, stretchby, move are fine as is from circle.
    
    //other (draw) are a start but need to be added to (extended)
    
    //toString -> override completely
    
    public void draw(Pen p){
        //call the parent version of draw
        super.draw(p);
        
        //draw the spokes
        for (int i = 1; i <=spokes; i++) {
            p.up();
            p.move(xPos,yPos);
            p.down();
            p.setDirection(i*(360/spokes));
            p.move(radius);
        }
        
    }
    
    public void setSpoke(int s){
        spokes = s;
    }
    
    public String toString(){
        String str = "Wheel\n======\n";
        str +="Xpos: "+xPos+" Ypos: "+yPos;
        str+= "\nRadius: "+radius;
        str+= "\nSpokes: "+spokes;
        str += String.format("\nArea: %.2f",area());
        return str;
    }
    
}
