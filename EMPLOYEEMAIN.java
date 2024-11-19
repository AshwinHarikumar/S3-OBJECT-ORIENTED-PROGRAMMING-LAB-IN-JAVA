import java.util.*;
class EMP
{
int salary;
String name=" ";
int houses;
void getinfo(int sal,String n, int n )
{salary=sal;
home=name+n;
houses=n;
}
void addsal(int sal)
{
if(sal<500)
{Salary=Salary+10;
}
void addwork(int n)
{
if(n>6)

Salary+=5;
}
}
class EMPLOYEEMAIN{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of employees");
int n=sc.nextInt();
EMP[]E=new Emp[n];
for (int i=0;i<n;i++)
{
E[i]=new Emp();
System.out.println("Enter details of Emp"+(i+1));
System.out.println("Enter your Name");
String Nam=sc.next.Int();
System.out.println("Enter Salary");
int Sal=sc.nextInt();
System.out.println("Enter homes");
int home=sc.next.Int();
E[i].getinfo(Sal,Nam,home);
E[i].addsal(Sal);
E[i].addwork(home);
}
for(int i=0;i<n;i++)
System.out.println("New Salary of Employee"+(i+1)+"is"+E[i].Salary);
}
}
}


