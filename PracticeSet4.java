import java.util.Scanner;
public class PracticeSet4{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    /*Q1) Write a program to find out whether a student is pass or fail;
    if it requires total 40% and at least 33% in each subject to pass. 
    Assume 3 subjects and take marks as an input from the user*/
    /*System.out.println("Enter the marks of subject 1 : ");
    float a = in.nextFloat();
    System.out.println("Enter the marks of subject 2 : ");
    float b = in.nextFloat();
    System.out.println("Enter the marks of subject 3 : ");
    float c = in.nextFloat();
    float d = (a+b+c)/3;
    if (a > 100 || b > 100 || c > 100){
        System.out.println("Please enter marks less than 100!");
    }
    else{
        if (a > 33 && b > 33 && c > 33 && d > 40){
            System.out.println("Your total percentage is "+  String.format("%.2f", d) +"\nYou are pass");
        }
        else{
            System.out.println("Your total percentage is "+ String.format("%.2f", d) +"\nYou are fail");
        } 
    }
*/
//------------------------------------------Q2)---------------------------------

/*    System.out.println("Enter the your salary : ");
    float salary = in.nextFloat();
    if (salary < 250000){
        System.out.println("No Tax");
    }
    else {
        if (salary >= 250000 && salary < 500000){
            System.out.println("Tax 5% -> "+ String.format("%.2f", salary*0.05));
        }
        else if(salary >= 500000 && salary < 1000000){
            System.out.println("Tax 20% -> "+ String.format("%.2f", salary*0.2));
        }
        else {
            System.out.println("Tax 30% -> "+ String.format("%.2f", salary*0.3));
        }
    }
*/

//------------------------------------------Q3)---------------------------------
    System.out.println("Enter the day number you want to find ");
    int day = in.nextInt();
    switch(day){
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid Input");
    }
    
    }
}