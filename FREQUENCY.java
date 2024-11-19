import java.util.*;
public class FREQUENCY
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
System.out.println("Enter the character");
char chr=sc.next().charAt(0);
int count=0;
int length=str.length();
for(int i=0;i<length;i++)
{
if(str.charAt(i)==chr)
{
count+=1;
}
}
System.out.println(count);
}
}


