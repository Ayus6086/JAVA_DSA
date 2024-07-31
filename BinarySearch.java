//In Binary search array should be sorted in asecnding order.
public class BinarySearch{
    public static int Binarysearch(int num[],int key){
        int start =0, end = num.length -1;
        
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start = mid+1;
            }else{
                end = mid - 1;
            }
    
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,6,12,13,19,45};
        int key = 19;
        System.out.println("Index of key is : "+ Binarysearch(num,key));
    }
}