import java.awt.*;
import java.applet.*;

public class RectApplet extends Applet{
	Rectangle aRectangle;
	public void init(){
		aRectangle = new Rectangle (50,50);
	}
	public void paint(Graphics g){
		g.drawString("Area is - " + aRectangle.Area(),20,25);
		g.drawString("Diagonal is - " + aRectangle.Diag(),20,35);
		g.drawString("Perimetr is - " + aRectangle.perimetr(),20,45);
		g.drawString("Is it square - " + aRectangle.IsBoll(),20,55);
		aRectangle.draw(g);
	}
}