public class Recursion{
    static int factorial(int n ){
        if (n == 0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void printDescend(int n){
        if(n==0) return ;
        System.out.println(n);
        printDescend(n-1);
    }
    
    public static void printAscend(int n){
        if(n==0) return ;
        printAscend(n-1);
        System.out.println(n);

    }
    public static void printArray(int arr[] , int i){
        if(i==arr.length) return;
            System.out.println(arr[i] + " ");
            printArray(arr, i+1);
    }
    public static boolean linearSearch(int arr[], int i, int target){
        if(arr.length==1) return false;
        if(arr[i]==target) return true;
        return linearSearch(arr,i+1,target);
    }
    public static void main(String[] args) {
        int x = 4;
        int i =0;
        int[] arr = {1,2,3,4,5};
        int target = 11;
        System.out.println("Factorial of x is: "+x*factorial(x-1));
        printDescend(x);
        printAscend(x);
        printArray(arr, i);
        System.out.println(linearSearch(arr, i, target));
    }
}