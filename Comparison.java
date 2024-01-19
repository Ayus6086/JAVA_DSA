//comparison operators -> use to compare two values
public class Comparison {
    public static void main(String[] args) {
        // int age = 11;
        // if (age<=60 && age>=18){
        //     System.out.println("You are eligible to Skydive");
        // }
        // else{
        //     System.out.println("You are not eligible to Skydive");
        // }
        int a = 10;
        int b = 10;
        if (a>b){
            System.out.println("a is greater than b");
        }
        else if (a<b){
            System.out.println("a is less than b");
        }
        else{
            System.out.println("a is equal to b");
        }
        int num = 4;
        String output = num%2 == 0 ? "Even " : "Odd";
        System.out.println(output);
    }
}