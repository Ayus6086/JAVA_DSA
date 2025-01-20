public class PracticeSet11{
    public static int printSum(int arr[], int index){
        if(index<0) return 0;
        return arr[index]+printSum(arr , index-1);
    }
    public static int printSumTwoDarray(int arry[][], int i, int j){{
        
    }

    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(printSum(arr , arr.length -1));
    }
}