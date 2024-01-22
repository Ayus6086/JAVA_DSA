// Write a program to calculate percentage of a given student in CBSE board exam.
//His/her marks from 5 subjects must be taken as input from the keyboard(marks out of 100).
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner Pr = new Scanner(System.in);
           /* System.out.println("Enter 1st Subject marks : ");
            int a = Pr.nextInt();
            System.out.println("Enter 2nd Subject marks : ");
            int b = Pr.nextInt();
            System.out.println("Enter 3rd Subject marks : ");
            int c = Pr.nextInt();
            System.out.println("Enter 4th Subject marks : ");
            int d = Pr.nextInt();
            System.out.println("Enter 5th Subject marks : ");
            int e = Pr.nextInt();
            int f = a + b + c + d + e;
            float s = (float)f/500*100;
            System.out.println("Total percentage : ");
            System.out.println(String.format("%.2f",s));*/

            //Write a program to Sum of the digits of number input from user
            System.out.println("Enter the number : ");
            int num = Pr.nextInt();
            int sum = 0;
            for (int i = 0; num!=0; i++) {
                int digit = num%10;
                sum = sum + digit;
                num = num/10;
            }
            System.out.println(sum);


            // int sum = 0;
            // while (num > 0) {
            //     int digit = num%10;
            //     sum = sum + digit;
            //     num = num/10;
            // }
            // System.out.println(sum);
    }
}