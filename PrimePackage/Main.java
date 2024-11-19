import java.util.*;
import prime.Prime;
public class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
if(Prime.isPrime(num))
{
System.out.println(num+"is a prime number");}
else
{
System.out.println(num+"is not a prime number");
}
}
}
