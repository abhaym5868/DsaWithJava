
class p10 { 
    
    p10() { 
    System.out.println("Default constructor "); 
    } 
     p10(int Value) { 
    System.out.println("Parameterized constructor with the value: " + Value); 
    } 
    
    int add(int a, int b) { 
    return a + b; 
    } 
    double add(double a, double b) { 
    return a + b; 
    }
    public static void main(String[] args) { 
        
        p10 o1 = new p10();  
        p10 o2 = new p10(10); 
        
        p10 calc = new p10(); 
        int sum1 = calc.add(5, 3); 
        double sum2 = calc.add(5.5, 3.7); 
        System.out.println("Sum of integers: " + sum1); 
        System.out.println("Sum of doubles: " + sum2); 
        } 
       }