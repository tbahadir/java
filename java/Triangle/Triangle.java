class Triangle{
double a,b,c;
public Triangle(double x,double y,double z){
a=x;b=y;c=z;
}
public String rtriangle(String s){
double m,k;
k=Math.pow(b,2) + Math.pow(a,2);
m=Math.pow(c,2);
if(m==k){s="this is right triangle " + m + " = " + k ;}
else{s="this isnot right triangle " + m + " != " + k;}
return s;
}
public String kk(String l){
return l;}
public String isosceles(String s){
int k=0;
if (a==b){k++;}
else if (a==c){k++;}
else if (c==b){k++;}
if (k==1||k==2){
s= "this is isosceles " + k ;
}
else{
s= "this isnt isosceles " +k;
}
return s;
}
}
