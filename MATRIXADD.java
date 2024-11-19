import java.util.*;
public class MATRIXADD{
public static void main(String args[])
{
int r,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of rows and columns");
r=sc.nextInt();
c=sc.nextInt();
int[][]a=new int[r][c];
int[][]b=new int[r][c];
int[][]sum=new int[r][c];
System.out.println("MATRIX A");
System.out.println("enter elements");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("MATRIX B");
System.out.println("enter elements");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j]=sc.nextInt();
}
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
sum[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("RESULT");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(sum[i][j]+"\t");
}
System.out.println("\n");

}
}
}



