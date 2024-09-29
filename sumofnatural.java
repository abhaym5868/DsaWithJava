import java.util.*;

public class sumofnatural {
    public static void main(String[] args) {
        int sum=0,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while (n>0){
               sum+=n;
               n-=1;
               
        }
        System.out.println("Sum of Natural No."+ sum);
    }
    
}
