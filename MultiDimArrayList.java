import java.util.*;
public class MultiDimArrayList{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> num = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num.add(num1);
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(2);
        num2.add(4);
        num2.add(6);
        num.add(num2);
        System.out.println(num);
        for(int i=0;i<num.size();i++){
            ArrayList<Integer> currLst = num.get(i);
            for(int j=0;j<currLst.size();j++){
                System.out.print(currLst.get(j)+" ");
            }
            System.out.println();

        }
    }
}