public class BubbleSort{
    public static void BubleSort(int num[]){
        boolean swap = false;
        for(int turn=0; turn<num.length-1; turn++){
            for(int j=0;j<num.length-1-turn;j++){
                if(num[j]>num[j+1]){
                int temp = num[j];
                 num[j] = num[j+1];
                 num[j+1]= temp;
                 swap = true;
            }
            }
            if(!swap){
                System.out.println("Array is already sorted");
                break;
            }
         
        }

        for(int i = 0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        int [] num = {1,2,3,4};
        BubleSort(num);
    }
}