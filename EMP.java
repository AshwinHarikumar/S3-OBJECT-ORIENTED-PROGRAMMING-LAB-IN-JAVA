import java.util.*;
class Emp
{
int salary;
String name="";
int hour;
void getinfo(int sal,String n, int h)
{
salary=sal;
name=name+n;
hour=h;
}
void addsal(int sal)
{
if (sal<500)
salary=salary+10;
}
void addwork(int h)
{
if (h>6)
salary +=5;
}
}

class EMP
{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter the no of employees");
int n=sc.nextInt();
Emp[] E=new Emp[n];
for (int i=0;i<n;i++)
{
E[i]=new Emp();
System.out.print("Enter the details of employee" +(i+1));
System.out.print("Enter the no your name");
String NAM=sc.next();
System.out.print("Enter salary");
int SAL=sc.nextInt();
System.out.print("Enter the hours");
int HOU=sc.nextInt();
E[i].getinfo(SAL,NAM,HOU);
E[i].addsal(SAL);
E[i].addwork(HOU);
}
for (int i=0;i<n;i++)
System.out.print("\n The new salary of the employee"+(i+1)+"is"+E[i].salary);
}
}




