import java.util.*;
public class REVERSE
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string");
String str=sc.nextLine();
String rev="";
for(int i =0;i<str.length();i++)
{
rev=str.charAt(i)+rev;
}
System.out.println(rev);
}
}


	
