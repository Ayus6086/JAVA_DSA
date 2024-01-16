import java.util.Scanner;
public class Userinput {
    public static void main(String[] args){
        System.out.println("Taking input from user");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a : ");
            int a = sc.nextInt();
            System.out.println("Enter b : ");
            int b = sc.nextInt();
            int c = a+b;
            System.out.print("Sum equals to : ");
            System.out.println(c);
            System.out.println("Enter d : ");
            float d = sc.nextFloat();
            System.out.println("Enter e :");
            float e = sc.nextFloat();
            System.out.print("Multiplication of e and f :");
            float f = e*d;
            System.out.println(String.format("%.2f",f));
            System.out.println("Enter your name : ");
            String Q = sc.nextLine();
            System.out.println(Q);
        }




    }
}