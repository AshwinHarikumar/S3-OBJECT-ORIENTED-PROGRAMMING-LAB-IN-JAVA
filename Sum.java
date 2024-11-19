import java.util.*;
class Sum{
public static void main (String[]args)
{
Scanner sc=new Scanner(System.in);
int sum=0;
System.out.println("enter the limit");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
sum=sum+i;
System.out.println("sum="+sum);
}
}

