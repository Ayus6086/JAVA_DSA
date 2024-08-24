public class PracticeSet10{
    public static void main(String[] args) {
        int [][] num = {{2,4,6},{6,7,8},{5,2,6}};
        //--> Search the no. of times the element is present.
        // int key = 2;
        // int count=0;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         if(num[i][j]==key){
        //             count++;
        //         }
        //     }
        // }
        // System.out.println(key+" is present "+count+" times in array");

        //--> sum of the particular row and column.
        // int sum = 0;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<1;j++){
        //         sum+=num[i][j];
        //     }
        // }
        // System.out.println(sum);

        //--> Transpose of a matrix
        int row = 3 , col = 3;
        int [][] transpose = new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            transpose[j][i] = num[i][j];
            }
        }

        for(int k=0;k<num.length;k++){
            for(int l =0;l<num[0].length;l++){
                System.out.print(transpose[k][l]+" ");
            }
            System.out.println();
        }
        


    }
}