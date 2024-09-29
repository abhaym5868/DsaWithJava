import java.util.Scanner;
public class p8 
{
public static void main(String[] args)
 {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows and columns of matrix A:");
int m = scanner.nextInt(); 
int n = scanner.nextInt(); 
int[][] A = new int[m][n];
System.out.println("Enter the elements of matrix A:");
for (int i = 0; i < m; i++) 
{
for (int j = 0; j < n; j++) 
{
A[i][j] = scanner.nextInt();
}
}

System.out.println("Enter the number of rows and columns of matrix B:");
int p = scanner.nextInt();
int q = scanner.nextInt(); 
if (n != p) 
{

return;
}
int[][] B = new int[p][q];
System.out.println("Enter the elements of matrix B:");
for (int i = 0; i < p; i++) {
for (int j = 0; j < q; j++) {
B[i][j] = scanner.nextInt();
}
}
int[][] result = multiplyMatrices(A, B);

System.out.println("Result of matrix multiplication:");
for (int i = 0; i < m; i++) {
for (int j = 0; j < q; j++) {
System.out.print(result[i][j] + " ");
}
System.out.println();
}
scanner.close();

}

public static int[][] multiplyMatrices(int[][] A, int[][] B) {
int m = A.length; 
int n = A[0].length; 
int p = B.length; 
int q = B[0].length; 
int[][] result = new int[m][q];
for (int i = 0; i < m; i++) {
for (int j = 0; j < q; j++) {
for (int k = 0; k < n; k++) {
result[i][j] += A[i][k] * B[k][j];
}
}
}
return result;
}
}

