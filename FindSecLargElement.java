import java.util.*;
public class FindSecLargElement{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};       
        int max = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondLargest=max;
                max = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=max){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}