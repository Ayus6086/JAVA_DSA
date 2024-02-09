/* A constructor is a block of code similar to a class
It is called when an instance of a class is created.

*/
class Person{
    public String name;
    public int age;
    public int mob;
    //default constructor
    public Person(){
        System.out.println("Hello World");
    }
    public Person(String name, int age){
        System.out.println("Para Constructor");
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, int mob){
        System.out.println("Para Constructor");
        this.name = name;
        this.age = age;
        this.mob = mob;
}
}
public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person("John",12);
        Person p2 = new Person();
        Person p3 = new Person("Harsh", 25, 928282);
        // p1.age = 15;
        // p1.name = "Mahesh";
        // System.out.println(p1.age);
        // System.out.println(p2.name);//Output Null because it not intiziled
        // System.out.println(p1.name);
        System.out.println(p1.name);
        System.out.println(p3.name);
        System.out.println(p3.age);
        System.out.println(p3.mob);
    }   
}