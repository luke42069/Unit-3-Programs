
package Lesson9.shapesv2;

import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;


public class MakeShape2 {

    
    public static void main(String[] args) {
        StandardPen p = new StandardPen(new SketchPadWindow(800,600));
        Circle c = new Circle();
        Rect r = new Rect();
        r.draw(p);
        c.draw(p);
        
        System.out.println(c.getXPos());
        System.out.println(r.getXPos());
    }
    
}
