public class SelectionSort{
    public static void selctionSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            int minPos = i;
            for(int j=i+1;j<num.length;j++){
                if(num[minPos]>num[j]){ 
                 minPos = j;
                }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
    }
    public static void main(String[] args) {
        int [] num = {5,3,8,7,9};
        selctionSort(num);
    }
}