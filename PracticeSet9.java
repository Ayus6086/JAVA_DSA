//Problem : Create a Class Cylinder use getters and setters to set and
//get its radius and height
class Cylinder{
    int radius;
    int height;
    public Cylinder(){
        System.out.println("Constructor Cylinder ");
    }
    public void setDim(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    public void getDim(){
        System.out.println("radius: "+radius);
        System.out.println("height: "+height);
    }
}
public class PracticeSet9{
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setDim(10, 20);
        c.getDim();
    }
}