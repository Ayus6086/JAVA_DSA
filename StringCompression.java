public class StringCompression{
    public static String compression(String str){
        String sc = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sc += str.charAt(i);
            if(count>1){
                sc += count.toString();
            }
        }
        return sc;
    }
    public static void main(String[] args) {
        String str = "aaaabbcccdddddd";
        System.out.println(compression(str));

    }
}