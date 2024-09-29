import java.util.*;
class fabbonacci{
    public static void main(String[] args) {
        int n,i=0,j=1,c,num;
        System.out.print("Enter the value of fabbonacci : ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(i);
        System.out.println("The value of fabbonacci sequence is : ");
        for(num=0;num<n;num++){
            System.out.println(j);
            c=i+j;
            i=j;
            j=c;
            // System.out.println();

        }
    }
}