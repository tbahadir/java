import java.awt.*;
import java.applet.*;
public class H1Applet extends Applet{
public void paint(Graphics g){
int X0[]={80,80,130,130,80};
int Y0[]={80,50,50,80,80};
g.drawPolygon(X0,Y0,5);
//int X1[],Y1[],i;// int a;
//for(i=0; i<5; i++){
//switch(i){
//case '0':
//X1[i]=80;
//break;
//case '1':
//a=Math.round(Math.sin(20) * 30);
//X1[i]=X1[i-1]+a;
//break;
//case '2':
//a=Math.round(Math.sin(70) * 50);
//X1[i]=X1[i-1]+a;
//break;
//case '3':
//a=Math.round(Math.sin(20) * 30);
//X1[i]=X1[i-1]-a;
//break;
//case '4':
//a=Math.round(Math.sin(70) * 50);
//X1[i]=X1[i-1]-a;
//break;
//default:
//break;
//}
//for(i=0; i<5; i++){
//switch(i){
//case '0':
//Y1[i]=80;
//break;
//case '1':
//a=Math.round( Math.sin(70) * 30);
//Y1[i]=Y1[i-1]-a;
//break;
//case '2':
//a=Math.round( Math.sin(20) * 50);
//Y1[i]=Y1[i-1]+a;
//break;
//case '3':
//a=Math.round( Math.sin(70) * 30);
//Y1[i]=Y1[i-1]+a;
//break;
//case '4':
//a=Math.round( Math.sin(20) * 50);
//Y1[i]=Y1[i-1]-a;
//break;
//default:
//break;
//}
//}
//double X1[] = {80,90.260,137.244,126.984,80};
//double Y[] = {80,51.81,68.911,97.101,80};
int X1[] = {80,90,137,126,80};
int Y[] = {80,51,68,97,80};
g.drawPolygon(X1,Y,5);
}
}
