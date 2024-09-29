
class ArithmeticOperations {
   
    public int add(int a, int b) {
        return a + b;
    }

    
    public int subtract(int a, int b) {
        return a - b;
    }

    
    public int multiply(int a, int b) {
        return a * b;
    }

    
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return (double) a / b;
    }
}


class BitwiseOperations {
    
    public int bitwiseAnd(int a, int b) {
        return a & b;
    }

    
    public int bitwiseOr(int a, int b) {
        return a | b;
    }

    
    public int bitwiseXor(int a, int b) {
        return a ^ b;
    }

   
    public int bitwiseNot(int a) {
        return ~a;
    }
}


public class OperationsDemo {
    public static void main(String[] args) {
     
        ArithmeticOperations arithmetic = new ArithmeticOperations();
        BitwiseOperations bitwise = new BitwiseOperations();

       
        System.out.println("Arithmetic Operations:");
        int a = 15, b = 5;
        System.out.println("Addition: " + arithmetic.add(a, b));
        System.out.println("Subtraction: " + arithmetic.subtract(a, b));
        System.out.println("Multiplication: " + arithmetic.multiply(a, b));
        System.out.println("Division: " + arithmetic.divide(a, b));

        
        System.out.println("\nBitwise Operations:");
        System.out.println("AND: " + bitwise.bitwiseAnd(a, b));
        System.out.println("OR: " + bitwise.bitwiseOr(a, b));
        System.out.println("XOR: " + bitwise.bitwiseXor(a, b));
        System.out.println("NOT: " + bitwise.bitwiseNot(a));
    }
}
