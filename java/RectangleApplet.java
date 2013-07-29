import java.awt.*;
import java.applet.*;
public class RectangleApplet extends Applet{
Rectangle aRectangle;
public void init(){
aRectangle=new Rectangle(50,50);
}
public void paint(Graphics g){
g.drawString("The area of rectangle is" + aRectangle.area(),20,20);
g.drawString("The diagonal of rectangle is" + aRectangle.diagonal(),20,40);
g.drawString("The perimeter of rectangle is" + aRectangle.perimeter(),20,60);
g.drawString("the suare is " + aRectangle.square(),20,80 );
aRectangle.draw(g);
}
}