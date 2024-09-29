import java.util.Arrays; 
public class p9 { 
 public static void main(String[] args) { 
 // list of names 
 String[] names = { "Roshan", "Manav", "Aryan", "Vrund", "Abhay"};

 // Sorting the names in ascending order 
 Arrays.sort(names); 
 // Output the sorted names in a list 
 System.out.println("Sorted names in ascending order:"); 
 for (String name : names) { 
 System.out.println(name); 
 } 
 } 
} 