import java.util.*;
public class Array{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{
System.out.println("Enter size fo Array:");
int size=sc.nextInt();
if(size<0){
throw new IllegalArgumentException("Array size cannot be negative");
}
int[]array=new int[size];
System.out.println("Array of size" + size + "created successfully");
}
catch(InputMismatchException e)
{
System.out.println("Error:You must enter an integer");
}
catch(IllegalArgumentException e)
{
System.out.println("Error:" +e.getMessage());
}
finally{
System.out.println("Execution Completed");
}
}
}
