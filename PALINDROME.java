import java.util.*;
public class PALINDROME
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int flag=0;
System.out.println("Enter the string");
String str=sc.nextLine();
int length=str.length();
for(int i=0;i<length/2;i++)
{
if(str.charAt(i)!=str.charAt(length-i-1))
{
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}

