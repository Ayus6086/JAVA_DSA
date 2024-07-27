import java.util.*;
class LinearSearch {
    public static int getLargestAndSmallest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest  = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest = num[i];
            }
            if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("Smallest no. is "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[]={2,8,1,11,5,48,7};
        System.out.println("Largest no. is "+ getLargestAndSmallest(num));
        }
    }
