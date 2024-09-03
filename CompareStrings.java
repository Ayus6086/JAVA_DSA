public class CompareStrings{
    public static void main(String[] args) {
        String s1 = "LPU";
        String s2 = "LPU";
        String s3 = new String("LPU");
        if(s1.equals(s2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        if(s1==s3){ // --> In this comparison(==) output will be not equal because of interning
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        //Always use (equal) function not == sign
        if(s1.equals(s3)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        
    }
}