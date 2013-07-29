import java.awt.*;
import java.applet.*;
public class RectangleAp extends Applet{
Rectangle aRectangle;
Label label;
Label label1;

Label label3;
public void init(){
aRectangle=new Rectangle(50,50);
label = new Label();
label1 = new Label();

label3 = new Label();
label.setText("the area is " + aRectangle.Area());
label.setAlignment(Label.RIGHT);
add(label);
label1.setText("the diagonalis " +aRectangle.Diag());
label1.setAlignment(Label.RIGHT);
add(label1);
label3.setText("the diagonalis " +aRectangle.perimeter());
label3.setAlignment(Label.RIGHT);
add(label3);
}
}