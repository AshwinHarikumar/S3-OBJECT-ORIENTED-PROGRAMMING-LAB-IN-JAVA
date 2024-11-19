import java.util.*;
interface Test{
int Square(int n);
}
class Arithmetic implements Test
{
public int Square(int n){
return n*n;
}
}
class TotestInt{
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a number to find its square");
int number=scanner.nextInt();
Arithmetic arithmetic=new Arithmetic();
int result=arithmetic.Square(number);
System.out.println("The result is: "+result);
scanner.close();
}
}
