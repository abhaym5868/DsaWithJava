interface Animal {
void sound(); 
}

interface Dog extends Animal {
void breed(); }

class Labrador implements Dog {

public void sound() {
System.out.println("Labrador barks");
}
public void breed() {
System.out.println("Labrador belongs to the Sporting breed");
}
} 

public class Main {
public static void main(String[] args) {
Labrador labrador = new Labrador();
labrador.sound(); 
labrador.breed();
}
}