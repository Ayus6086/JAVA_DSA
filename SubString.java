public class SubString{
    public static String getSubString(String str, int si,  int ei){
        String substr = "";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String greet = "Hello Everyone";
        System.out.println(greet.substring(0,4));//in-built function substring
        System.out.println(getSubString(greet, 0, 5));
    }
}