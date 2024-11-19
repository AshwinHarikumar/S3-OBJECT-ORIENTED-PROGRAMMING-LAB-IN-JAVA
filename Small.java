import java.util.*;
public class Small
{
 public static void main(String args[])
 {
  int[] a= new int[20];
  int n,first_small=Integer.MAX_VALUE,sec_small=Integer.MAX_VALUE;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter no of elements:");
  n= sc.nextInt();
  System.out.println("Enter elements:");
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  for(int i=0;i<n;i++)
  {
   if (a[i]<first_small)
   {
    sec_small=first_small;
    first_small=a[i];
   }
   else if(a[i]<sec_small&&a[i]!=first_small)
   {
    sec_small=a[i];
   }
  }
  if(sec_small!= Integer.MAX_VALUE)
  {
   System.out.println("Second smallest="+ sec_small);
  }
  else
  {
   System.out.println("No Second smallest element");
  }
 }
}
