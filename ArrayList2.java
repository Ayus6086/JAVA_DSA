import java.util.*;
public class ArrayList2{
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(11);
        num.add(8);
        num.add(3);
        num.add(6);

        //Find Maximum
        int max = Integer.MIN_VALUE;
        for(int i=0;i<num.size();i++){
            // if(num.get(i)>max){
            //     max = num.get(i);
            // }
            max = Math.max(num.get(i), max);
        }
        System.out.println("Max element: "+max);

        //Swapping
        System.out.println("Before Swapping "+num);//1,11,8,3,6
        int indx1 = 1;
        int indx2 = 4;

        int temp = num.get(indx1);
        num.set(indx1, num.get(indx2));
        num.set(indx2, temp);

        System.out.println("After Swapping "+ num);//1,6,8,3,11

        // //Sorting - Ascending Order
        // System.out.println("Before Sorting "+ num);
        // Collections.sort(num);
        // System.out.println("After Sorting "+num);

        //Sorting - Decending Order
        System.out.println("Before Sorting "+ num);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("After Sorting "+num);
    }
}