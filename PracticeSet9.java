//Problem : Create a Class Cylinder use getters and setters to set and
//get its radius and height
// class Cylinder{
//     int radius;
//     int height;
//     public Cylinder(){
//         System.out.println("Constructor Cylinder ");
//     }
//     public void setDim(int radius, int height){
//         this.radius = radius;
//         this.height = height;
//     }
//     public void getDim(){
//         System.out.println("radius: "+radius);
//         System.out.println("height: "+height);
//     }
// }
// public class PracticeSet9{
//     public static void main(String[] args) {
//         Cylinder c = new Cylinder();
//         c.setDim(10, 20);
//         c.getDim();
//     }
// }



/*-> Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/
import java.util.Scanner;
public class PracticeSet9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost Pen");
        float a = sc.nextFloat();
        System.out.println("Enter the cost Pencil");
        float b = sc.nextFloat();
        System.out.println("Enter the cost Eraser");
        float c = sc.nextFloat();
        float d = a+b+c;
        float totalcost = d + d*0.18f;
        System.out.printf("Total cost with 18%% GST: %.2f\n", totalcost);
    }
}
