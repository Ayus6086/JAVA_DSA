import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsGame{
    public static void main(String[] args) {
    Random r = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("-----Rock_Paper_Scissors_Game-----");
    System.out.println("Enter 0 for Rock");
    System.out.println("Enter 1 for Paper");
    System.out.println("Enter 2 for Scissors");
    System.out.println("Enter your preference ");
    int a = sc.nextInt();
    int b = r.nextInt(3);
    if (a < 3){
    System.out.println("Computer input "+ b); 
    if (a == 0 && b == 1){
	System.out.println("Computer wins");	
}
    else if (a == 0 && b == 2){
	System.out.println("you wins");	
}
    else if (a == 1 && b == 0){
	System.out.println("you wins");	
}
    else if (a == 1 && b == 2){
	System.out.println("Computer wins");	
}
    else if (a == 2 && b == 0){
	System.out.println("Computer wins");	
}
    else if (a == 2 && b == 1){
	System.out.println("you wins");	
}
   else if (a == b){
	System.out.println("Game tie");	
    }
    }
else{
    System.out.println("Invalid input");
}   
}
}
