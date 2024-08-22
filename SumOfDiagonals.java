public class SumOfDiagonals{
    public static int sumOfDiagonals(int num[][]){
        int sum = 0;
        for(int i=0;i<num.length;i++){
            //primary diagonal
            sum += num[i][i];
            //Secondary diagonal
            if(i!= num.length-1-i){ 
            sum += num[i][num.length-i-1];
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int [] [] num = { {1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumOfDiagonals(num));
    }
}