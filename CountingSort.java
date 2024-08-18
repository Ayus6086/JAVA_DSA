public class CountingSort{
    public static void countingSort(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            largest = Math.max(largest, num[i]);
        }
        int count[] = new int[largest+1] ;
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }
        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] num = {7,5,3,7,4,6,9};
        countingSort(num);
    }
}