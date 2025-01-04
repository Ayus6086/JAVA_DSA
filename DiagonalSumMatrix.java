import java.util.Scanner;
public class DiagonalSumMatrix{
    public static void printDiaSum(int matrix[][]){
        
        // int m = sc.nextInt();
        // int n = sc.nextInt();
        int sum=0;
        int m = matrix.length;
        int n = matrix[0].length;
        if(m!=n){
            System.out.println("Matrix is not a Square Matrix");
        }
        else{
            for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                sum+=matrix[i][j];
                }
                }
            }
            System.out.println("Diagonal Sum is: "+ sum);
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int m = sc.nextInt();
        System.out.println("Enter the no. of columns");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printDiaSum(matrix);

    }
}