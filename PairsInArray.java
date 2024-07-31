public class PairsInArray{
    public static void pairs(int num[]){
        int totalPairs = 0;
        for(int i=0;i<=num.length-1;i++){
            for(int j=i+1;j<=num.length-1;j++){
                System.out.print("("+num[i] +","+ num[j]+") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print("Total numbers of pair : "+ totalPairs);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9};
        pairs(arr);
    }
}