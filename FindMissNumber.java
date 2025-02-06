public class FindMissNumber{
    public static void main(String[] args) {
        int [] arr = {2,4,6,3,1};
        int n=6;
        int totalsum = n*(n+1)/2;
        int arrsum = 0;
        for(int i=0;i<arr.length;i++){
            arrsum+=arr[i];
        }
        int missingNum = totalsum - arrsum;
        System.out.println(missingNum);
    }
}