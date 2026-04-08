import java.util.*;
public class PracticeSet12{
    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;
        String a = s.toLowerCase();
        while(i<j){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static String reverse(String s){
        StringBuilder s1 = new StringBuilder(s);
        int i=0;
        int j = s.length()-1;
        while(i<j){
            char temp = s1.charAt(i);
            s1.setCharAt(i,s1.charAt(j));
            s1.setCharAt(j,temp);
            i++;
            j--;
        }
        return s1.toString();
    }
    public static void count(String s){
        int n = s.length();
        int v=0;
        int c = 0;
        String a = s.toLowerCase();
        for(int i=0;i<n;i++){
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                v++;
            }else if(a.charAt(i)>='a' && a.charAt(i)<='z'){
                c++;
            }
        }
        System.out.println("Vowels: "+v+", Consonant: "+c);
    }
    public static void main(String[] args) {
        String a = "Heledleh";
        System.out.println(isPalindrome(a));
        System.out.println(reverse(a));
        count(a);
    }
}