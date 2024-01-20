import java.util.Scanner;
public class PracticeSet1{
    public static void main(String[] args) {
        //Q1) Write program to sum of the three numbers
        /*try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a : ");
            int a = sc.nextInt();
            System.out.println("Enter b : ");
            int b = sc.nextInt();
            System.out.println("Enter c : ");
            int c = sc.nextInt();
            int sum = a+b+c;
            System.out.println("Sum is -> " + sum);
        }*/

        //Q2) Write program to calculate CGPA using marks of three subjects (out of 100)
        /*try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter marks of subject 1 : ");
            int m1 = sc.nextInt();
            System.out.println("Enter marks of subject 2 : ");
            int m2 = sc.nextInt();
            System.out.println("Enter marks of subject 3 : ");
            int m3 = sc.nextInt();
            float cgpa = (m1+m2+m3)/30;
            System.out.println("CGPA is -> " + cgpa);
        }*/

        //Q3) Write a program which ask the user to enter his/her name and 
        //greets them with "Hello <name>,have a good day" text
        /*try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your name : ");
            String name = sc.nextLine();
            System.out.println("Hello " + name + ",have a good day!");
        }*/

        //Q4) Write a program to convert kilometers to meters
        /*try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter length in kilometers -> ");
            float length = sc.nextFloat();
            float meter = length * 1000;
            System.out.println("Length in meters is -> " + meter);
        }*/

        //Q5) Write a program to detect whether a number is int or not

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number : ");
            System.out.println(sc.hasNextInt());
            
        }

            
    }
}