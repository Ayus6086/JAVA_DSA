import java.util.Scanner;
public class PracticeSet6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1) Sum of array
        // int [] arr = {10, 20, 30, 40, 50, 60};
        // int sum = 0;
        // for(int i = 0; i < arr.length; i++){
        //     sum += arr[i];
        // }
        // System.out.println(sum);
        // //Q2) find the number present in the array or not
        // System.out.println("Enter the number: ");
        // int a = sc.nextInt();
        // for(int j=0; j< arr.length; j++){
        //     if(arr[j]==a){
        //         System.out.println(a+" is present in the array");
        //         break;
        //     }
        //     else{
        //         System.out.println(a+" is not present in the array");
        //         break;
        //     }
        // }
        //Q3) Find the average marks of all the students in the phycics(using for-each loop)?
        // int marks = 0;
        // for(int i: arr){
        //     marks += i;
        // }
        // System.out.println("Average marks of all the students in the phycics: "+ marks/6);
        // //Q4) ADD two martices of order 2x3
        // int [][] a = new int [2][3];
        // int [][] b = new int [2][3];
        // a [0][0] = 1;
        // a [0][1] = 1;
        // a [0][2] = 1;
        // a [1][0] = 1;
        // a [1][1] = 1;
        // a [1][2] = 1;
        // b [0][0] = 1;
        // b [0][1] = 1;
        // b [0][2] = 1;
        // b [1][0] = 1;
        // b [1][1] = 1;
        // b [1][2] = 1;
        // System.out.println("Addition of two martices of order 2x3");
        // for(int i=0; i<2; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(a[i][j] + b[i][j] +" ");
                
        //     }
        //     System.out.println();
        // }
        
        //Q5) Find maximum no. in array
        int [] arry = {10, 20, 30, 40, 50, 60};
        int max = Integer.MIN_VALUE;
        for(int e : arry){
           if (e >max){
            max = e;
           }
        }
        System.out.println("Maximum no. in array: "+ max);

        //Q6) Find minimum no. in array;
        int min = Integer.MAX_VALUE;
        for(int e : arry){
           if (e <min){
            min = e;
           }
        }
        System.out.println("Minimum no. in array: "+ min);

        //Q7) Find Whether the array is sorted or not;
        int [] arr = {10, 20, 3, 40, 50, 60};
        boolean issorted = true;
        for(int i = 0; i < arr.length -1 ; i++){
            if(arr[i]> arr[i+1]){
                issorted = false;
                break;   
            }
            
        }
        if(issorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}