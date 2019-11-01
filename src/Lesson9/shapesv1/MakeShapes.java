package Lesson9.shapesv1;

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;


public class MakeShapes {

    public static void main(String[] args) {/*
        Circle c = new Circle(50, 50, 100);
        Shape c1 = new Circle(50, 50, 100);
        Rect r = new Rect(100, 100, 150, 50);
        Shape r1 = new Rect(100, 100, 150, 50);

        Shape shapes[] = new Shape[10];
        for (int i = 0; i < 10; i++) {
            shapes[i] = i % 2 == 0 ? new Circle(10, 10, 10) : new Rect(10, 10, 10, 10);
        }
        
        
        //polymorphism
        Shape silly = new Circle(0,0,0);
        silly = new Rect(50,50,200,100);
        
        Pen p = new StandardPen(new SketchPadWindow(640,480));
        silly.draw(p);
        silly = new Circle(0,0,100);
        silly.draw(p);
        System.out.println(silly);*/
        
        Wheel w = new Wheel(10,10,50,6);
        System.out.println("Wheel is at "+w.getXPos() +","+w.getYPos());
        
        Shape shp[] = new Shape[10];
        for (int i = 0; i < shp.length; i++) {
            if(i<3)shp[i] = getRandCircle();
            else if (i<5){ shp[i] = getRandWheel();System.out.println(shp[i]);}
            else shp[i]=getRandRect();
        }
        
        //draw shapes
        StandardPen p = new StandardPen(new SketchPadWindow(640,480));
        for (Shape s : shp) {
            s.draw(p);
        }
        //resize shapes
        Scanner scan = new Scanner(System.in);
        p.setColor(Color.red);
        System.out.println("Press any key to shrink a shape");
        for (Shape s : shp) {
            
            scan.nextLine();
            s.erase(p);
            s.stretchBy(.5);
            s.draw(p);
        }
        p.setColor(Color.green);
         System.out.println("Press any key to move a shape");
        for (Shape s : shp) {
           
            scan.nextLine();
            s.erase(p);
            s.move(s.getXPos()+50,s.getYPos()+50);
            s.draw(p);
        }
        System.out.println("Press any key to turn all circles green");
        
        for (Shape shape : shp) {
            if(shape instanceof Circle){//test to make sure you can run the method
                ((Circle)shape).turnGreen(p);//this is what casting an object looks like
                //((int)z).something;
            }
            if(shape instanceof Wheel)System.out.println(shape);
        }
        System.out.println("And wheels have had their spokes set to 20");
        for (Shape shape : shp) {
            if(shape instanceof Wheel){
                shape.erase(p);
                ((Wheel)shape).setSpoke(20);
            }
        }
            
            
    }
    
    public static Circle getRandCircle(){
        Circle temp = new Circle((Math.random() * 400 - 200),(Math.random() * 400 - 200),(Math.random() * 50 +50));
        return temp;
    }
    
    public static Rect getRandRect(){
        Rect temp = new Rect((Math.random() * 400 - 200),(Math.random() * 100 +50),(Math.random() * 50 +50),(Math.random() * 50 +50));
        return temp;
    }
    
    public static Circle getRandWheel(){
        //default 5 spokes
        Wheel temp = new Wheel((Math.random() * 400 - 200),(Math.random() * 400 - 200),(Math.random() * 50 +50),10);
        return temp;
    }

}
