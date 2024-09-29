import java.util.Scanner;
class p5
{
public static void main(String []args){
Scanner s1=new Scanner(System.in);
System.out.print("Enter value of a: ");
float a=s1.nextFloat();
System.out.print("Enter value of b: ");
float b=s1.nextFloat();
System.out.print("Enter value of c: ");
float c=s1.nextFloat();
double x=b*b-4*a*c;
if(x>0){
double r1 = (-b+Math.sqrt(x))/(2*a);
double r2 = (-b-Math.sqrt(x))/(2*a);
System.out.println("This is real solutions:");
System.out.println("Root1: "+r1);
System.out.println("Root2: "+r2);
}else{
System.out.println("This is no real solutions.");
}
}
}
