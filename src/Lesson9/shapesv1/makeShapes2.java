
package Lesson9.shapesv1;

import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;


public class makeShapes2 {

    
    public static void main(String[] args) {
        StandardPen p = new StandardPen(new SketchPadWindow(640,480));
        Circle c[] = new Circle[5];
        for (int i = 0; i < 5; i++) {
            c[i] = new Circle(0,0,Math.random()*300+20);
            c[i].draw(p);
        }
        System.out.println("The average radius is "+Circle.getAvgRadius());
        
    }
    
}
