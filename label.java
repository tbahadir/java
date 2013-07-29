import java.awt.*;
import java.applet.*;
public class label extends Applet{
Label label;
public void init(){
label=new Label();
label.setText("hello world!");
label.setAlignment(Label.CENTER);
add(label);
}
}