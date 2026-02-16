import java.util.*;
public class StackInfixToPostfix{
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
    static String infixToPostfix(String s){
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                res.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res.append(st.pop());
                }
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    return "Invalid expression";
                }
            }
            else{
                while(!st.isEmpty() && priority(ch)<= priority(st.peek())){
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)";
        System.out.println("Infix: "+s);
        System.out.println("Postfix: "+ infixToPostfix(s));
    }
}