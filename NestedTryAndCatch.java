import java.util.Scanner;
public class NestedTryAndCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int i = sc.nextInt();
        try{
            System.out.println("Level 1");
            try{
                System.out.println(arr[i]);
                System.out.println("You are in nested try and catch");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException occured: in nested try and catch");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured:");
            System.out.println(e);
        }
    }
}