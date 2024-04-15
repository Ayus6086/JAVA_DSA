import java.util.Scanner;
public class ExceptionHandling{
    public static void main(String[] args) {
        int [] arr = new int[4];
        arr[0] = 0;
        arr[1] = 11;
        arr[2] = 12;
        arr[3] = 80;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array number: ");
        int n = sc.nextInt();
        try{
            System.out.println(arr[3]/arr[n]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrrayIndexOutOfBoundsException occured:");
            System.out.println(e);
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occured:");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Exception occured:");
            System.out.println(e);
        }
        System.out.println("END OF PROGRAM");
    }
}