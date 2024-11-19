import java.util.*;
public class ArraySizeExample{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{
System.out.println("Enter size fo array:");
int size=sc.nextInt();
if(size<0){
throw new NegativeArraySizeException("Array size cannot be negative");
}
int[] array=new int[size];
System.out.println("Array of size" + size + "created successfully");
}
catch(NegativeArraySizeException e)
{System.out.println("Error:" +e.getMessage());}
catch(Exception e)
{System.out.println("An unexpected error occured:" +e.getMessage());}
finally{
sc.close();}}}
