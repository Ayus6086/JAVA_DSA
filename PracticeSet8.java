// class Employee{
//     int salary;
//     String name;
//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String nam){
//         name = nam;
//     }
// }

// class Cellphone{
//     public void ringing(){
//         System.out.println("Ringing...");
//     }
//     public void vibrate(){
//         System.out.println("Vibrating...");
//     }
//     public void incoming(){
//         System.out.println("Harsh Calling...");
//     }
// }

class Square{
    int a;
    public int area(int x){
        return x*x;
    }
    public int perimeter(int x){
        return 4*x;
    }
}
public class PracticeSet8{
    public static void main(String[] args) {
        //problem 1:
        // Employee e1 = new Employee();
        // e1.name = "Ayush";
        // e1.salary= 1200;
        // System.out.println(e1.getSalary());
        // System.out.println(e1.getName());
        // e1.setName("John");
        // System.out.println(e1.getName());
        
        //problem 2:
        // Cellphone poco = new Cellphone();
        // poco.ringing();
        // poco.vibrate();
        // poco.incoming();

        //problem 3:
        Square s1= new Square();
        System.out.println("Area is : "+ s1.area(4));
        System.out.println("Perimeter is : "+ s1.perimeter(8));
    }
}