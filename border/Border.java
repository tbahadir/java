import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Border extends Applet implements ActionListener{
TextField T;
Label L1,L2;
int a,c=0;
String s;
public void init(){
T=new TextField(4);
L1=new Label();
L2=new Label();
setLayout(new BorderLayout());
add("North",T);
add("Center",L1);
add("South",L2);
T.addActionListener(this);
a = (int)(100*Math.random()+1);
}
public void actionPerformed(ActionEvent e){
int b= Integer.parseInt(T.getText());
if(a > b){
L1.setText("it is too small");
}
else if(b>a){
L1.setText(" it is too bigger");
}
else if (a==b){
L1.setText("it is equaol congralations!");
}
c++;
L2.setText("number of attempts = " + c );
} 
}