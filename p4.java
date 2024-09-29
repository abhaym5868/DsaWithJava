import java.util.Scanner;
public class p4
{
public static void main(String []args)
{
int id , age;
double salary;
Scanner V=new Scanner(System.in);
System.out.println("Enter employee ID: ");
id=V.nextInt();
System.out.println("Enter employee Name: ");
String name=V.next();
System.out.println("Enter employee Age: ");
age=V.nextInt();
System.out.println("Enter employee City: ");
String city=V.next();
System.out.println("Enter employee Salary: ");
salary=V.nextDouble();
System.out.println("\nEmployee details:");
System.out.println("ID:"+id);
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("City:"+city);
System.out.println("Salary:"+salary);
}
}