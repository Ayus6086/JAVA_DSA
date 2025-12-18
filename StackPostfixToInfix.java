import java.util.*;
public class StackPostfixToInfix{
    static boolean isOperator(char ch){
        return ch== '+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    static String postfixToInfix(String postfix){
        Stack<String> stack = new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(String.valueOf(ch));
            }else if(isOperator(ch)){
                String op2 = stack.pop();
                String op1 = stack.pop();

                String expr = "(" + op1 + ch + op2 + ")";
                stack.push(expr);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String postfix = "ab+c*";
        System.out.println("Postfix: "+postfix);
        System.out.println("Infix: "+postfixToInfix(postfix));
    }
}