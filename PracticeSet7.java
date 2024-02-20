public class PracticeSet7{
    // static void multiplication(int n){
    //     for(int i=1; i<11; i++){
    //         int b = n*i;
    //         System.out.println(n + " * "+ i + " = "+ b);
    // }
    // }

    // static void pattern1(int v ){
    //     for(int i=0; i<=v ; i++){
    //         for(int j=0; j<i+1; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // static void pattern2(int v ){
    //     for (int i =v ; i>0;i--){
    //         for (int j=i; j>0; j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // static int sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     else{
    //         return n + sum(n-1);
    //     }
    // }
    // static int fib(int n){
    //     if(n==1){
    //         return 0;
    //     }
    //     else if(n==2){
    //         return 1;
    //     }
    //     else{
    //         return fib(n-1) + fib(n-2);
    //     }
    // }
    // static int avg (int ...args){
    //     int count = 0;
    //     int sum =0;
    //     for(int a : args){
    //         sum += a;
    //         count++;
    //     }
    //     return sum/count;
    // }
    static int repeat(int n){
        return repeat(n);
    }
    public static void main(String[] args) {
        // multiplication(3);//problem1
        // pattern1(5);//problem2
        // pattern2(4);//problem3
        // System.out.println(sum(5));//problem4
        // System.out.println(fib(5));//problem5
        // System.out.println("Average : "+ avg(1,2,3,4,5));//problem6
        System.out.println(repeat(5));//problem7
    }
}