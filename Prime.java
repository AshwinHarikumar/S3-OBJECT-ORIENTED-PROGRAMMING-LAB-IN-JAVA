package Prime;
public class Prime{
public static boolean isPrime (int n)
{
if(n==1)
{
return false;
}
for(int i=2;i<=(n/2);i++)
{
if(n%2==0)
{
return false;
}
}
return true;
}
}

