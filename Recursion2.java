public class Recursion2{
    public static void printIndex(int arr[], int key,int i){
        if(i==arr.length) return;
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printIndex(arr,key,i+1);
    }
    public static int printSum(int n){
        if(n==0) return 0;
        return n+printSum(n-1);
    }
    public static int printFibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return printFibo(n-1)+printFibo(n-2);
    }
    public static void main(String[] args) {
        int []arr ={1,2,4,6,1,6,1,3,1};
        int key=1;
        int i=0;
        String str= "abcd";
        int n=6;
        printIndex(arr,key,i);
        System.out.println();
        System.out.println(printSum(n));
        System.out.println(printFibo(n));
    }
}