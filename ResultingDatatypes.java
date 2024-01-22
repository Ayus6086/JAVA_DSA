public class ResultingDatatypes {
    public static void main(String[] args) {
        /*
        int m = 4;
        float f = 5.5f + m;
        System.out.println(f);// F is float 
        long l = 433333333;
        int i = 88;
        long j = l + i;
        System.out.println(j);// j is long or int value
        */
        //----------increment and decrement-----------
        int x = 5;
        System.out.println(x++);//increment +1 after compilation
        System.out.println(x);//= 6
        int y = 5;
        System.out.println(++y);//increment +1 before compilation-> (6)
        int z = 10;
        System.out.println(z--);//decrement -1 after compilation
        System.out.println(z);//= 9
        int w = 10;
        System.out.println(--w);//decrement -1 before compilation-> (9)
        int a = 5;
        int b = 10;
        int c = a++ + ++b;
        System.out.println(c);
        System.out.println(a);
        
    }
}
