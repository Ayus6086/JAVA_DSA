interface Animal{
    int eyes = 2;
    public void eat();
}
class Lion implements Animal{
    public void eat(){
        System.out.println("Lion is carnivoros");
    }
}
class Cow implements Animal{
    public void eat(){
        System.out.println("Cow is hervivoros");
    }
}

public class Interface{
    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.eat();
        Cow c1 = new Cow();
        c1.eat();
    }
}