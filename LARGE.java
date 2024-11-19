import java.util.*;
public class LARGE
{
public static void main(String args[])
{
int[]a=new int[20];
int n,large=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of elements:");
n=sc.nextInt();
System.out.println("enter array elements");
for(int i=0;i<n;i++)
{a[i]=sc.nextInt();}
for(int i=0;i<n;i++)
{
if (a[i]>large)
{large=a[i];}}
System.out.println("Largest="+large);
}
}
