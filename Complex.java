import java.util.*;
class Complex
{
int real,img;
static void Add(Complex c1,Complex c2)
{
int res_real=c1.real+c2.real;
int res_img=c1.img+c2.img;
System.out.println(c1.real+"+"+c1.img+"i+"+c2.real+"+"+c2.img+"i ="+res_img+"i");
}
static void Sub(Complex c1,Complex c2)
{
int res_real=c1.real-c2.real;
int res_img=c1.img-c2.img;
System.out.println(c1.real+"+"+c1.img+"i -"+c2.real+"+"+c2.img+"i ="+res_img+"i");
}
static void Pro(Complex c1,Complex c2)
{
int res_real=(c1.real*c2.real)-(c2.img*c1.img);
int res_img=(c1.real*c2.img)-(c2.real*c1.img);
System.out.println(c1.real+"+"+c1.img+"i *"+c2.real+"+"+c2.img+"i ="+res_real+"+"+res_img+"i");
}
public static void main(String args[])
{
Complex one=new Complex();
Complex two=new Complex();
Scanner Sd=new Scanner(System.in);
System.out.println("Enter real part of Number one");
one.real=Sd.nextInt();
System.out.println("Enter real part of Number one");
one.real=Sd.nextInt();
System.out.println("Enter imaginary part of Number one");
one.img=Sd.nextInt();
System.out.println("Enter real part of Number two");
two.real=Sd.nextInt();
System.out.println("Enter imaginary part of Number two");
two.img=Sd.nextInt();
System.out.println("Addition of one and two");
Add(one,two);
System.out.println("Subtracion of one and two");
Sub(one,two);
System.out.println("Multiplication of one and two");
Pro(one,two);
}
}


