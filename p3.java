import java.util.*;
public class p3
{
int add(int x,int y)
{
int z;
z=x+y;
return z;
}
int sub(int x,int y)
{
int z;
z=x-y;
return z;
}
int multiply(int x,int y)
{
int z;
z=x*y;
return z;
}
int divide(int x,int y)
{
int z;
z=x/y;
return z;
}
int modulus(int x,int y)
{
int z;
z=x%y;
return z;
}
int and(int x,int y)
{

int z;
z=x&y;
return z;
}
int or(int x,int y)
{
int z;
z=x|y;
return z;
}
int xor(int x,int y)
{
int z;
z=x^y;
return z;
}
int left(int x,int y)
{
int z;
z=x<<y;
return z;
}
int right(int x,int y)
{
int z;
z=x>>y;
return z;
}


public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
p3 o = new p3();
int p=o.add(10,5);
int q=o.sub(10,5);
int r=o.multiply(10,5);
int s=o.divide(10,5);
int t=o.modulus(10,5);
int a=o.and(10,5);
int b=o.or(10,5);
int c=o.xor(10,5);
int d=o.left(10,5);
int e=o.right(10,5);
System.out.println("\nArithmetic Operators:");
System.out.println("Add = "+p);
System.out.println("Sub = "+q);
System.out.println("Multiply = "+r);
System.out.println("Divide = "+s);
System.out.println("Modulus = "+t);
System.out.println("\nBitwise Operators:");
System.out.println("And = "+a);
System.out.println("Or = "+b);
System.out.println("Xor = "+c);
System.out.println("Left = "+d);
System.out.println("Right = "+e);
}
}
