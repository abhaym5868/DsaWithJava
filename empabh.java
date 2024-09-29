
import java.util.Scanner;


class empabh{

    public static void calculate(int a,int b,String c){
        
     switch (c) {
        case "+":
        System.out.println(a+b);
        break;
        case "-":
        System.out.println(a-b);
        break;
        case "*":
        System.out.println(a*b);
        break;
        case "/":
        System.out.println(a/b);
        break;
        default:
        System.out.println("invalid operator");
        
    }

     }
    

      public static void main(String[] args) {
        int a,b;
        String d;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        d=sc.next();


      calculate(a,b,d);
            
   
    }
}
