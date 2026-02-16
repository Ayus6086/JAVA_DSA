import java.util.*;
public class StackPrefixToPostfix{
    static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    static String stackPrefixToPostfix(String prefix){
        int n = prefix.length()-1;
        Stack<String> st = new Stack<>();
        while(n>=0){
            char c = prefix.charAt(n);
            if(!isOperator(c)){
                st.push(String.valueOf(c));
            }else{
                String t1=st.pop();
                String t2 = st.pop();
                String expr = t1+t2+c;
                st.push(expr);
            }
            n--;
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String ss = "/-AB*+DEF";
        System.out.println(stackPrefixToPostfix(ss));
    }
}