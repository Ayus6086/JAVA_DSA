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
    public static void main(String[] args) {
        int x = 4;
        System.out.println("Factorial of x is: "+x*factorial(x-1));
        printDescend(x);
        printAscend(x);
    }
}