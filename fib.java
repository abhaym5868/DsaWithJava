import java.util.Scanner; 
class fib
{
public static void main(String []args)
{
Scanner fibo= new Scanner(System.in);
 int i,p,q=1,r=1,s;
  System.out.println("\nEnter value s="); 
  s=fibo.nextInt();
System.out.println("\nFibonacci sequence:\n"); 
System.out.println(" "+q); 
System.out.println(" "+r);
for(i=0;i<s-2;i++)
{
p=q+r; 
q=r;



r=p;
System.out.println(" "+p);
}
}
}
