import java.awt.*;
import java.applet.*;
public class RectangleAp extends Applet{
Rectangle aRectangle;
Label label;
public void init(){
aRectangle=new Rectangle(50,50);
label=new Label();
label.setText("the area is " + aRectangle.Area());
label.setAlignment(Label.RIGHT);
add(label);
}
}