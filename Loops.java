public class Loops{
    public static void main(String[] args) {
        // System.out.println("----While Loop----");//First check conditon then exceute
        // int i = 100;
        // while (i <= 200){
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println("----End of while Loop----");

        // System.out.println("----do while Loop----");//First exceute then check condition
        // int a = 1;
        // do {
        //     System.out.println(a);
        //     a++;
        // } while (a <= 10);
        // System.out.println("----End of do while Loop----");

        System.out.println("----For Loop----");
        int n = 10;
        System.out.println("First n odd numbers. n = " + n);
        for (int i = 0; i < n; i++){
            System.out.println(2*i+1);
        }

    }
}