import java.awt.Graphics;

class ChildRectangle extends Rectangle{

private int x;
private int y;
public ChildRectangle(int awidth, int aheight){
  super(awidth,aheight);
}
public void set_x(int ax){
x=ax;
}
public void set_y(int ay){
y=ay;
}
public int get_x(int ax){return ax;}
public int get_y(int ay){return ay;}
int x1=(x+get_height())/2;
int y1=(y+get_width())/2;
public double c_per(int x1,int y1){
double Per;
Per=Math.sqrt(Math.pow(x1,2)+ Math.pow(y1,2))*4;
return Per;
}
public double area(){
double area;
area=((get_width()-x)*(get_height()-y))-(2*(x1*y1));
return area;
}
public void draw(Graphics g){
g.drawRect(x,y,get_width(),get_height());
g.drawLine(x,y1,get_width(),y1);	
g.drawLine(x1,y,get_width(),y1);
g.drawLine(get_width(),y1,x1,get_height());
g.drawLine(x1,get_height(),x,y1);
}
}