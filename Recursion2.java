public class Recursion2{
    public static void printIndex(int arr[], int key,int i){
        if(i==arr.length) return;
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printIndex(arr,key,i+1);
    }
    public static void main(String[] args) {
        int []arr ={1,2,4,6,1,6,1,3,1};
        int key=1;
        int i=0;
        String str= "abcd";
        printIndex(arr,key,i);
        //System.out.println();
    }
}