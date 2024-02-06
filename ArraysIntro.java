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
    System.out.println(age[2]);
    }
}