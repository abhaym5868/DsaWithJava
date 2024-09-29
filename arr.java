import java.util.Scanner;
public class arr {
    public static void main(String[] arg){
        int n;
        System.err.print("Enter the no. of element in Array:");
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        int arr[] = new int[n];
        System.err.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            int ele;
            ele=sc.nextInt();
            arr[i]=ele;
            
        }System.err.println("The elements are : ");
        for (int i = 0; i < arr.length; i++){
            System.err.println(arr[i]);
        }
       
    }
    }
    

