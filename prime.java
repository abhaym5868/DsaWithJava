
import java.util.*;

public class prime {
    public static void main(String[] args) {
    int p,c=0;
    System.err.print("Enter the integer number : ");
    Scanner sc=new Scanner(System.in);
    p=sc.nextInt();
    for(int i=2;i<=p/2;i++){
        if (p%i==0){
        System.out.println("It is not a prime number");
        c=1;
        break;
        }
    }
    if (c==0){
        System.out.println("prime number");
    }
    
}
}
 
