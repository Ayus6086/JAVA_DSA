class Shape{
    public void area(){
        System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l , int h){
        System.out.println(0.5*l*h);
    }
}

public class Inheritance{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area();
        Triangle t = new Triangle();
        t.area(4, 8);
    }
}