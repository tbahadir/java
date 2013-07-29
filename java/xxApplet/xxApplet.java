import java.awt.*;
import java.applet.*;
public class xxApplet extends Applet{
public void paint(Graphics g){
int x1[] = { 20,70,70,20,20 }; int x2[]={ 20,20,50,50,20 };
g.drawPolygon(x1,x2,5);
int i=0;
int x1[i]={20};int x2[i]={20}

for(int i=1; i<5; i++){
x1[i] = (int)(x1[i] * Math.sin(20));
x2[i] = (int)(x2[i] * Math.sin(70));
}
g.drawPolygon(x1,x2,5);
for(int j=0; j<5; j++){
x1[j] = (int) (x1[j] *(double) Math.sin(20));
x2[j] = (int) (x2[j] *(double) Math.sin(70));

}
g.drawPolygon(x1,x2,5);

}
}
