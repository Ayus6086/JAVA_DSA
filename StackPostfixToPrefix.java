import java.util.*;
public class StackPostfixToPrefix{
    static String stackPostfixToPrefix(String s){
        Stack<String> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }else{
                String t1=st.pop();
                String t2 = st.pop();
                String expr = ch + t2 +t1;
                st.push(expr);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String postfix = "ab+c*";
        System.out.println(stackPostfixToPrefix(postfix));
    }
}