public class ArraysIntro{
    public static void main(String[] args) {
    //----There are three ways to declare arrays----
    //Q1) Declaration and memory allocation
    int [] marks = new int[4];
    //intialization
    marks[0] = 100;
    marks[1] = 90;
    marks[2] = 80;
    System.out.println(marks[2]);
    //Q2) Declaration and then memory allocation
    /*int [] age;
    age = new int[3];
    age[0] = 20;
    age[1] = 30;
    age[2] = 40;*/
    //Q3) Declaration and initialization
    int[] age ={20, 30, 40};
    System.out.println("Int type: "+ age[2]);
    float [] num = {23.5f , 45.6f , 45.7f , 45.8f};
    System.out.println("Float type:"+ num[2]);
    String [] name ={"Ayush", "Anand", "ShriRaam"};
    System.out.println("Strings type: "+ name[0]);
    }
}