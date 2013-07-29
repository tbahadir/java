import java.awt.Graphics;
class Rectangle{
private int width, height;
public Rectangle(int awidth, int aheight){
		width=awidth;
		height=aheight;
	}
public int get_width(){return width;}
public int get_height(){return height;}
public float Area(){
		float area;
		area = (float)(width*height);
		return area; 
	}
public float Diag(){
		float diag;
		diag = (float)Math.sqrt((Math.pow(height,2)+Math.pow(width,2)));
		return diag;  
	}
public float perimetr(){
		float perm;
		perm = width + height;
		return perm;
	}
public boolean IsBoll(){
		boolean sqr=false;
		if (width==height)
			sqr=true;
		return sqr;
	}
public void draw(Graphics g){
		g.drawRect(25,100,width,height);
	}
}