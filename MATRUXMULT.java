import java.util.*;
public class MATRUXMULT
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int res[][]=new int[10][10];
int i,j,k;
System.out.println("Enter the no of rows and columns of matrix A");
int r1=sc.nextInt();
int c1=sc.nextInt();
System.out.println("Enter the no of rows and columns of Matrix B");
int r2=sc.nextInt();
int c2=sc.nextInt();
if(c1==r2)
{
System.out.println("Enter the elements of Matrix A");
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
for(k=0;k<c1;k++)
{
res[i][j]=res[i][j]+a[i][k]*b[k][j];
}
}
}
System.out.println("The result is:");
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
System.out.println(res[i][j]+"\t");
}
}
}
else
{
System.out.println("INVALID INPUT");
}
}
}






