import java.util.*;
public class MonotonicArrayList{
    public static boolean isMono(ArrayList<Integer> arr){
        boolean increasing = true;
        boolean decreasing = true;
         for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i + 1)) {
                increasing = false;
            }
            if (arr.get(i) < arr.get(i + 1)) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        nums.add(4);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        System.out.println(isMono(num));
        System.out.println(isMono(nums));
    }
}