import java.util.*;
public class PairSum{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);
        int target = 12;
        //brute force approach
        for(int i=0;i<arr.size();i++){
            int sum =0;
            for(int j=0;j<arr.size();j++){
                sum = arr.get(i)+arr.get(j);
                if(sum==target){
                    System.out.println("Pair are : "+arr.get(i)+" "+arr.get(j));
                    return;
                }
            }
        }
    }
}