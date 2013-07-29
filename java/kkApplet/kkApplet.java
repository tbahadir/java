import java.awt.*;
import java.applet.*;
public class kkApplet extends Applet{
public void paint(Graphics g){
int x1,x2,y1,y2;
x1=50;y1=50;x2=50;y2=50;
g.drawLine(50,50,400,50);  //for horizantal line
g.drawLine(50,10,50,100);   //for vertical line
do{
y2=y2+ (int)(3 * (double) Math.sin(x1)* 3.14);
g.drawLine(x1,y1,x2,y2);  //for graphics line
y1= y2;
x1= x2;
x2= x2 + 20;
}while(x2<400);
}
}


//if y2=48, 5* (double)math.sin..., then its similar graphics on book
