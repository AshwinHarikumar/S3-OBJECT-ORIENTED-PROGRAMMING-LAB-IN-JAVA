import java.util.*;
class AREA
{
static double length,breadth,x1,x2,y1,y2;
void setDim(double l,double b)
{
l=length;
b=breadth;
}
double getarea()
{
double area=0;
area=length*breadth;
return area;
}
double getperimeter()
{
double perimeter=0;
perimeter=2*(length+breadth);
return perimeter;
}
double getdiagonal()
{
double diagonal=0;
double sum=(length*length)+(breadth*breadth);
diagonal=Math.sqrt(sum);
return diagonal;
}
void midpoint()
{
double x2=x1+length;
double y2=y1+breadth;
double x=(x1+x2)/2;
double y=(y1+y2)/2;
System.out.println("The mid point is("+x+","+y+")");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enetr the length");
length=sc.nextInt();
System.out.print("Enetr the breadth");
breadth=sc.nextInt();
System.out.print("Enetr the corner coordinates");
x1=sc.nextInt();
x2=sc.nextInt();
AREA obj=new AREA();
obj.setDim(length,breadth);
obj.getarea();
obj.getperimeter();
obj.midpoint();
System.out.print("the area"+obj.getarea());
System.out.print("the perimeter"+obj.getperimeter());
System.out.print("the diagonal"+obj.getdiagonal());
}
}


