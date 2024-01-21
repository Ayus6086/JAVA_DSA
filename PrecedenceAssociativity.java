public class PrecedenceAssociativity{
    public static void main(String[] args) {
        int a = 40+ 50 - 100; // * and / have more precedence than + and -
        int b = (50 + 40) / 2;// () have more precedence than / and -
        int c = 90 / 10 * 40 % 35 ;// Assocativity - left to right
        // If two or more opretors havig same precedence then we see Associativity
        int d = (100 / 10) *  (25*2);// Right to left
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}