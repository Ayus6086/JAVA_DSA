import java.util.*;
public class StackInfixToPrefix{
    static int priority(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static String infixToPrefix(String s){
        StringBuilder res = new StringBuilder(s);
        res.reverse();
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)=='('){
                res.setCharAt(i, ')');
            }else if(res.charAt(i)==')'){
                res.setCharAt(i,'(');
            }
        }
        String postfix = infixToPostfix(res.toString());

        StringBuilder prefix = new StringBuilder(postfix);
        return prefix.reverse().toString();
    }
    static String infixToPostfix(String s){
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    result.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && (priority(ch) < priority(st.peek()) ||
                (priority(ch) == priority(st.peek()) && ch != '^'))){
                    result.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "A+B*(C-D)";
        System.out.println(infixToPrefix(s));
    }
}