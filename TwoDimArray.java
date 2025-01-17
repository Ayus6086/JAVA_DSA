import java.util.*;
public class TwoDimArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int marks[] [] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                marks[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int  i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=marks[i][j];
            }
        }
        System.out.println("Sum of all the elements: "+sum);
        //print like a wave
        for(int j=0;j<n;j++){
            if(j%2==0){
            for(int i=0;i<m;i++){
                System.out.print(marks[i][j]);
            
            }
            }
            else{
                for(int i=m-1;i>=0;i--){
                    System.out.print(marks[i][j]);
                }
            }
        }
        }
        
    }