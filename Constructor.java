class Person{
    public String name;
    public int age;
    public Person(){
        System.out.println("Hello World");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.age = 15;
        p1.name = "Mahesh";
        System.out.println(p1.age);
        System.out.println(p2.name);//Output Null because it not intiziled
        System.out.println(p1.name);
    }
}