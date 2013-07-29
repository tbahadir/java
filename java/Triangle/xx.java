import java.awt.*;
import java.applet.*;
public class xx extends Applet{
Triangle t;

public void init(){
t=new Triangle(3,4,5);
}

public void paint(Graphics g){
g.drawString(t.rtriangle(""),20,25);
g.drawString(t.isosceles(""),20,50);
g.drawString(t.kk("3"),20,75);
}
}