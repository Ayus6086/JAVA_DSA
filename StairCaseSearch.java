public class StairCaseSearch{
    public static boolean search(int num[][], int key){
        int row = 0, col = num[0].length-1;

        while(row<num.length && col>=0){
            if(num[row][col]==key){
                System.out.println("Key found at ("+ row + ","+col+")");
                return true;
            }
            else if (key<num[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int [] [] num = { {1,2,3},{4,5,6},{7,8,9}};
        int key = 9;
        search(num,key);
    }
}