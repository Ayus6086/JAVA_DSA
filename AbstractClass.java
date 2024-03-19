//Abstract class is a restricted class that cannot be used to create objects.
abstract class Animal{
    abstract void walk();
    
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Peacock extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        Peacock p1 = new Peacock();
        p1.walk();
    }
}