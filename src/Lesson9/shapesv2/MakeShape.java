/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.util.Scanner;

/**
 *
 * @author luke2720
 */
public class MakeShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Pen p = new StandardPen();
        
        Shape c = new Circle(0,0,25);
        Shape r = new Rect(0,0,50,25);
        Shape w = new Wheel(-75,0,25,3);
        
        c.draw(p);
        r.draw(p);
        w.draw(p);*/
       
       Pen p = new StandardPen(new SketchPadWindow(800,600));
       
       Shape s; //can become a rect, circle or wheel
       Circle c; //can become a circle or wheel
       Wheel w; //can only be a wheel
       
       //s = new Shape(10,10); cant instantiate an abstract class
       s = new Rect(10,10,10,10);
       s = new Wheel(10,10,10,10);//polymorph
       s = new Circle(10,10,10);
       c = new Circle(10,10,10);
       c = new Wheel(10,10,10,10);//polymorph
       
       w = new Wheel(1,010,10,10);
       
       Shape actual = new Rect(0,0,200,100);
       actual.draw(p);
       Scanner scan = new Scanner(System.in);
        System.out.print("Press any key to mak it cirle");
        scan.nextLine();
        actual.erase(p);
        actual = makeShapeFromAnother(actual,'c');
        actual.draw(p);
        
        System.out.print("\nPress any key to mak it wheel");
        scan.nextLine();
        actual.erase(p);
        actual = makeShapeFromAnother(actual,'w');
        actual.draw(p);
    }
    
    public static Shape makeShapeFromAnother(Shape s, char type){//can return any type of shape and input any type as param
        double x = s.getXPos();
        double y = s.getYPos();
        double area = s.area();
        
        if(type =='r'){
            double width = Math.sqrt(area);
            double height = Math.sqrt(area);
            return new Rect(x,y,width,height);
        }
        else if (type =='c'){
            double radius = Math.sqrt(area / Math.PI );
            return new Circle(x,y,radius);
        }
        else{
            //wheel by default
          //area =   pi * r*r
          //r^2 = area/pi
            double radius = Math.sqrt(area / Math.PI );
            return new Wheel(x,y,radius,6);
        }
    }
    
}
