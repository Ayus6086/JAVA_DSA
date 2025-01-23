import java.util.*;
//import java.util.Stack;

public class StackIntro{
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        while(!s1.isEmpty()){
            System.out.println(s1.pop()+" ");
        }
        int []arr={1,2,3,4};
        for(int i=0;i<arr.length;i++){
            System.out.println(s1.push(arr[i]));
        }
        //System.out.println();
    }
}