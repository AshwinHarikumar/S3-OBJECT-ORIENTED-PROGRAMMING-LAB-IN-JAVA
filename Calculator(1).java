import java.util.*;
public class Calculator
{
public static void main(String[] args)
{
int result;
Scanner sc=new Scanner(System.in);
System.out.println("Choose an operation");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("Enter the choice");
int choice=sc.nextInt();
System.out.println("enter the first number");
int num1=sc.nextInt();
System.out.println("eneter the second number");
int num2=sc.nextInt();
switch(choice)
{
case 1:
result=num1+num2;
System.out.println("Result:"+num1+"+"+num2+"="+result);
break;
case 2:
result=num1-num2;
System.out.println("Result:"+num1+"-"+num2+"="+result);
break;
case 3:
result=num1*num2;
System.out.println("Result:"+num1+"*"+num2+"="+result);
break;
case 4:
result=num1/num2;
System.out.println("Result:"+num1+"/"+num2+"="+result);
break;
default:System.out.println("Invalid choice");
}
}
}


