import java.util.Scanner;
public class PracticeSet5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        // //Q1)Multiplication Table
        // System.out.println("Multiplication Table of "+ n);
        // for(int i=1;i<11;i++){
        // System.out.println(n+" * "+ i +" = "+ n*i);
        // }
        // //Multiplication table in reverse order 
        // System.out.println("Multiplication Table of "+ n + "in reverse order.");
        // for(int i=10;i>0;i--){
        // System.out.println(n+" * "+ i +" = "+ n*i);
        // }
        //Q2)Factorial
        // int fact =1;
        // for(int i=n ; i>0;i--){
        //     fact *=i;
        // }
        // System.out.println("Factorial of "+ n + " = "+ fact);
        //Q3)Sum of multipication
        // System.out.println("Sum of multipication "+ n);
        // int sum =0;
        // for(int i=1;i<11;i++){
        // int b = n*i;
        // sum += b;
        // }
        // System.out.println("Sum of multipication "+ n + " = "+ sum);
        //Q4)Pattern printing
    //     int k=4;
    //    for(int i=k;i>0;i--){
    //     for(int j=i;j>0;j--){
    //         System.out.print("*");
    //     }
    //     System.out.println("\n");
    //    }

    //Q5) sum of first n even numbers
    int sum=0;
    for(int i=0;i<n;i++){
        sum += (2*i);
    }
    System.out.println("Sum of first "+ n +" even numbers "+ " = "+ sum);
    }
}