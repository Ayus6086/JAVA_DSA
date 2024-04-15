//The try statement allows you to define a block of code to be tested for errors while it is being executed.
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
import java.util.Scanner;
public class TryAndCatch{
    public static void main(String[] args) {
        int a = 5000;
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        // int c = a/b;
        // System.out.println(c);
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Incorrect input");
            System.out.println("Error: "+e);
        }
        System.out.println("End of program");
    }
}