import java.awt.*;
import java.applet.*;
public class MyText extends Applet{
TextField textfield;
TextArea textarea;
String s;
public void init(){
s="we are the student of neu";
textfield=new TextField(30);
textfield.setText(s);
add(textfield);
textarea = new TextArea(s,3,30);
add(textarea);
s="\n We study the language";
textarea.append(s);
s="java";
textarea.insert(s,39);
}
public void paint(Graphics g){
s="This text field has"+textfield.getColumns()+ "columns";
g.drawString(s,20,150);
s="the text is:<" +textfield.getText()+ ">";
g.drawString(s,20,175);
g.drawString("the echobar mode is" +textfield.echoCharIsSet(),20,200);
s="this text area has "+textarea.getColumns()+ "columns";
s +="and" +textarea.getColumns()+ "columns";
g.drawString(s,20,225);
}
}